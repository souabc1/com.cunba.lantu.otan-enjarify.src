package com.cunba.lantu.otan.model;

import android.os.Environment;
import java.io.File;
import m54207b69;

public class Constant
{
  public static final String ACTIVATE_RESULT = "otan_activate_result";
  public static final String AGENT_ID_KEY = "agentId";
  public static final String APP_INITILIZED = "app_init_5.1.4";
  public static final String BROADCAST_ACTION_CLIENT_FEATURES = "com.cunba.lantu.c.features";
  public static final String BROADCAST_ACTION_HOST_FEATURES = "com.cunba.lantu.h.features";
  public static final String BROADCAST_FEATURE_KEY = "feature";
  public static final String CLIENT_FEATURE_AC = "ac";
  public static final String CLIENT_FEATURE_APP_SETTINGS = "app_settings";
  public static final String CLIENT_FEATURE_DISABLE_PED_ALARM = "disable_ped_alarm";
  public static final String CLIENT_FEATURE_INSTALLAPK = "install";
  public static final String CLIENT_FEATURE_REFRESH_WEATHER_INFO = "refresh_weather_info";
  public static final String CLIENT_FEATURE_RESOURCE = "resource";
  public static final String CLIENT_FEATURE_RESTART = "restart";
  public static final String CLIENT_FEATURE_SHELL = "shell";
  public static final String DEALERID_KEY = "otan_dealerID";
  public static final String HOOK_APP_WIDGET = "hook_app_widget";
  public static final String HOOK_HOME_NAVI_KEY = "hook_home_navi";
  public static final String HOOK_NAVIBAR1_AUTOLAUNCH_KEY = "hook_navibar1_autolaunch";
  public static final String HOOK_NAVIBAR2_AIQIYI_KEY = "hook_navibar2_aiqiyi";
  public static final String HOOK_NAVIBAR2_AUTOLAUNCH_KEY = "hook_navibar2_autolaunch";
  public static final String HOOK_NAVIBAR2_FM_KEY = "hook_navibar2_FM";
  public static final String HOOK_NAVIBAR2_KALAOK_KEY = "hook_navibar2_kalaok";
  public static final String HOOK_NAVIBAR2_MUSIC_KEY = "hook_navibar2_music";
  public static final String HOOK_NAVIBAR2_NAVIGATION_KEY = "hook_navibar2_navigation";
  public static final String HOOK_NAVIBAR_MUSIC_KEY = "hook_navibar_music";
  public static final String HOOK_NAVIBAR_NAVIGATION_KEY = "hook_navibar_navigation";
  public static final String HOST_FEATURE_LANGUAGE = "language";
  public static final String HOST_FEATURE_MODEL = "model";
  public static final String HOST_FEATURE_PACKAGENAME = "packageName";
  public static final String HOST_FEATURE_SERIAL = "serial";
  public static final String HOST_FEATURE_TYPE = "type";
  public static final String HOST_FEATURE_VIN = "vin";
  public static final String LANGUAGE_ACTIVATE_STATUS_KEY = "language_activate_status";
  public static final String LANGUAGE_AC_KEY = "language_ac_enc";
  public static final String LAUNCHER_ACTIVATE_STATUS_KEY = "launcher_activate_status";
  public static final String LAUNCHER_AC_KEY = "launcher_ac_enc";
  public static final File OverlayFolder;
  public static final File PatchFolder;
  public static final String SIDEBAR_KEY = "show_xuanfuchuang";
  
  static
  {
    File localFile1 = new java/io/File;
    File localFile2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    String str = m54207b69.F54207b69_11("h85B4E585D5D1C4E6054645A");
    localFile1.<init>(localFile2, str);
    PatchFolder = localFile1;
    localFile1 = new java/io/File;
    localFile2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    str = m54207b69.F54207b69_11("H85B4E585D5D1C5D5565535E644D");
    localFile1.<init>(localFile2, str);
    OverlayFolder = localFile1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.model.Constant
 * JD-Core Version:    0.7.0.1
 */