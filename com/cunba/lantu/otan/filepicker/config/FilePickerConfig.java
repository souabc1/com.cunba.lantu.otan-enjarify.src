package com.cunba.lantu.otan.filepicker.config;

import android.content.Context;
import android.content.res.Resources;
import com.cunba.lantu.otan.R.string;
import com.cunba.lantu.otan.R.style;
import com.cunba.lantu.otan.filepicker.engine.ImageEngine;
import java.io.File;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import m54207b69;

public final class FilePickerConfig
{
  public static final FilePickerConfig.Companion OooOooO;
  public int OooO;
  public final FilePickerManager OooO00o;
  public boolean OooO0O0;
  public final Lazy OooO0OO;
  public final Resources OooO0Oo;
  public boolean OooO0o;
  public boolean OooO0o0;
  public boolean OooO0oO;
  public boolean OooO0oo;
  public final String OooOO0;
  public String OooOO0O;
  public String OooOO0o;
  public File OooOOO;
  public String OooOOO0;
  public AbstractFileFilter OooOOOO;
  public AbstractFileDetector OooOOOo;
  public FileItemOnClickListener OooOOo;
  public final Lazy OooOOo0;
  public ItemClickListener OooOOoo;
  public String OooOo;
  public String OooOo0;
  public int OooOo00;
  public String OooOo0O;
  public int OooOo0o;
  public String OooOoO;
  public int OooOoO0;
  public ExecutorService OooOoOO;
  public ImageEngine OooOoo;
  public boolean OooOoo0;
  
  static
  {
    FilePickerConfig.Companion localCompanion = new com/cunba/lantu/otan/filepicker/config/FilePickerConfig$Companion;
    localCompanion.<init>(null);
    OooOooO = localCompanion;
  }
  
  public FilePickerConfig(FilePickerManager paramFilePickerManager)
  {
    this.OooO00o = paramFilePickerManager;
    localObject = LazyKt.OooO0O0(FilePickerConfig.customFileTypes.2.o00OoOoo);
    this.OooO0OO = ((Lazy)localObject);
    paramFilePickerManager = paramFilePickerManager.getContextRef$app_ZHRelease();
    Intrinsics.OooO0OO(paramFilePickerManager);
    paramFilePickerManager = paramFilePickerManager.get();
    Intrinsics.OooO0OO(paramFilePickerManager);
    paramFilePickerManager = ((Context)paramFilePickerManager).getResources();
    this.OooO0Oo = paramFilePickerManager;
    int i = 1;
    this.OooO0o = i;
    this.OooO0oO = i;
    this.OooO = (-1 >>> 1);
    i = R.string.file_picker_tv_sd_card;
    localObject = paramFilePickerManager.getString(i);
    Intrinsics.OooO0o0(localObject, "contextRes.getString(R.s…g.file_picker_tv_sd_card)");
    this.OooOO0 = ((String)localObject);
    this.OooOO0O = ((String)localObject);
    localObject = m54207b69.F54207b69_11("_U06021C0A1817161118160B1B132822281A17132D1B292827");
    this.OooOO0o = ((String)localObject);
    this.OooOOO0 = "";
    localObject = LazyKt.OooO0O0(FilePickerConfig.defaultFileDetector.2.o00OoOoo);
    this.OooOOo0 = ((Lazy)localObject);
    i = R.style.FilePickerThemeCrane;
    this.OooOo00 = i;
    i = R.string.file_picker_tv_select_all;
    localObject = paramFilePickerManager.getString(i);
    Intrinsics.OooO0o0(localObject, "contextRes.getString(R.s…ile_picker_tv_select_all)");
    this.OooOo0 = ((String)localObject);
    i = R.string.file_picker_tv_deselect_all;
    localObject = paramFilePickerManager.getString(i);
    Intrinsics.OooO0o0(localObject, "contextRes.getString(R.s…e_picker_tv_deselect_all)");
    this.OooOo0O = ((String)localObject);
    i = R.string.file_picker_selected_count;
    this.OooOo0o = i;
    i = R.string.file_picker_tv_select_done;
    localObject = paramFilePickerManager.getString(i);
    Intrinsics.OooO0o0(localObject, "contextRes.getString(R.s…le_picker_tv_select_done)");
    this.OooOo = ((String)localObject);
    i = R.string.max_select_count_tips;
    this.OooOoO0 = i;
    i = R.string.empty_list_tips_file_picker;
    paramFilePickerManager = paramFilePickerManager.getString(i);
    Intrinsics.OooO0o0(paramFilePickerManager, "contextRes.getString(R.s…ty_list_tips_file_picker)");
    this.OooOoO = paramFilePickerManager;
  }
  
  private final ArrayList getCustomFileTypes()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ArrayList)m54207b69.F54207b69_09(265, arrayOfObject);
  }
  
  public final FilePickerConfig OooO00o(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (FilePickerConfig)m54207b69.F54207b69_09(257, arrayOfObject);
  }
  
  public final void OooO0O0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(258, arrayOfObject);
  }
  
  public final FilePickerConfig OooO0OO(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (FilePickerConfig)m54207b69.F54207b69_09(259, arrayOfObject);
  }
  
  public final FilePickerConfig OooO0Oo(FileItemOnClickListener paramFileItemOnClickListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramFileItemOnClickListener;
    return (FilePickerConfig)m54207b69.F54207b69_09(260, arrayOfObject);
  }
  
  public final FilePickerConfig OooO0o0(String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString1;
    arrayOfObject[2] = paramString2;
    return (FilePickerConfig)m54207b69.F54207b69_09(261, arrayOfObject);
  }
  
  public final String getConfirmText()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(262, arrayOfObject);
  }
  
  public final AbstractFileDetector getCustomDetector()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (AbstractFileDetector)m54207b69.F54207b69_09(263, arrayOfObject);
  }
  
  public final ImageEngine getCustomImageEngine()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ImageEngine)m54207b69.F54207b69_09(266, arrayOfObject);
  }
  
  public final String getCustomRootPath()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(267, arrayOfObject);
  }
  
  public final File getCustomRootPathFile$app_ZHRelease()
  {
    return this.OooOOO;
  }
  
  public final String getDeSelectAllText()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(268, arrayOfObject);
  }
  
  public final DefaultFileDetector getDefaultFileDetector()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (DefaultFileDetector)m54207b69.F54207b69_09(269, arrayOfObject);
  }
  
  public final String getDefaultStorageName$app_ZHRelease()
  {
    return this.OooOO0;
  }
  
  public final String getEmptyListTips()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(270, arrayOfObject);
  }
  
  public final FileItemOnClickListener getFileItemOnClickListener()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (FileItemOnClickListener)m54207b69.F54207b69_09(271, arrayOfObject);
  }
  
  public final int getHadSelectedText()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(273, arrayOfObject);
  }
  
  public final ItemClickListener getItemClickListener()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ItemClickListener)m54207b69.F54207b69_09(274, arrayOfObject);
  }
  
  public final int getMaxSelectCountTips()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(275, arrayOfObject);
  }
  
  public final int getMaxSelectable()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(276, arrayOfObject);
  }
  
  public final String getMediaStorageName()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(277, arrayOfObject);
  }
  
  public final String getMediaStorageType()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(278, arrayOfObject);
  }
  
  public final String getSelectAllText()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(279, arrayOfObject);
  }
  
  public final AbstractFileFilter getSelfFilter()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (AbstractFileFilter)m54207b69.F54207b69_09(280, arrayOfObject);
  }
  
  public final boolean getSingleChoice()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(281, arrayOfObject);
  }
  
  public final int getThemeId()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(282, arrayOfObject);
  }
  
  public final ExecutorService getThreadPool$app_ZHRelease()
  {
    return this.OooOoOO;
  }
  
  public final boolean getThreadPoolAutoShutDown$app_ZHRelease()
  {
    return this.OooOoo0;
  }
  
  public final boolean isAutoFilter()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(283, arrayOfObject);
  }
  
  public final boolean isShowHiddenFiles()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(284, arrayOfObject);
  }
  
  public final boolean isShowingCheckBox()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(285, arrayOfObject);
  }
  
  public final boolean isSkipDir()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(286, arrayOfObject);
  }
  
  public final void setAutoFilter(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(287, arrayOfObject);
  }
  
  public final void setCustomDetector(AbstractFileDetector paramAbstractFileDetector)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAbstractFileDetector;
    m54207b69.F54207b69_00(288, arrayOfObject);
  }
  
  public final void setThreadPool$app_ZHRelease(ExecutorService paramExecutorService)
  {
    this.OooOoOO = paramExecutorService;
  }
  
  public final void setThreadPoolAutoShutDown$app_ZHRelease(boolean paramBoolean)
  {
    this.OooOoo0 = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.filepicker.config.FilePickerConfig
 * JD-Core Version:    0.7.0.1
 */