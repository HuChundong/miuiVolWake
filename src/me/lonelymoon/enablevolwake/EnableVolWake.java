package me.lonelymoon.enablevolwake;
import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.callbacks.XC_InitPackageResources.InitPackageResourcesParam;

public class EnableVolWake implements IXposedHookInitPackageResources {

    @Override
    public void handleInitPackageResources(InitPackageResourcesParam resparam) throws Throwable {
         if (!resparam.packageName.equals("com.android.settings"))
        	 return;
        	 resparam.res.setReplacement("com.android.settings", "bool", "has_volume_wake", R.string.app_name);
    }	
}