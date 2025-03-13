package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.core.content.ContextCompat;

public class PreferenceManager
{
  public int OooO = 0;
  public final Context OooO00o;
  public long OooO0O0 = 0L;
  public SharedPreferences OooO0OO;
  public PreferenceDataStore OooO0Oo;
  public boolean OooO0o;
  public SharedPreferences.Editor OooO0o0;
  public String OooO0oO;
  public int OooO0oo;
  public PreferenceScreen OooOO0;
  public PreferenceManager.PreferenceComparisonCallback OooOO0O;
  public PreferenceManager.OnPreferenceTreeClickListener OooOO0o;
  public PreferenceManager.OnNavigateToScreenListener OooOOO;
  public PreferenceManager.OnDisplayPreferenceDialogListener OooOOO0;
  
  public PreferenceManager(Context paramContext)
  {
    this.OooO00o = paramContext;
    paramContext = OooO0OO(paramContext);
    setSharedPreferencesName(paramContext);
  }
  
  public static SharedPreferences OooO0O0(Context paramContext)
  {
    String str = OooO0OO(paramContext);
    int i = getDefaultSharedPreferencesMode();
    return paramContext.getSharedPreferences(str, i);
  }
  
  public static String OooO0OO(Context paramContext)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    paramContext = paramContext.getPackageName();
    localStringBuilder.append(paramContext);
    localStringBuilder.append("_preferences");
    return localStringBuilder.toString();
  }
  
  private static int getDefaultSharedPreferencesMode()
  {
    return 0;
  }
  
  private void setNoCommit(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      SharedPreferences.Editor localEditor = this.OooO0o0;
      if (localEditor != null) {
        localEditor.apply();
      }
    }
    this.OooO0o = paramBoolean;
  }
  
  public Preference OooO00o(CharSequence paramCharSequence)
  {
    PreferenceScreen localPreferenceScreen = this.OooOO0;
    if (localPreferenceScreen == null) {
      return null;
    }
    return localPreferenceScreen.OoooOoO(paramCharSequence);
  }
  
  public PreferenceScreen OooO0Oo(Context paramContext, int paramInt, PreferenceScreen paramPreferenceScreen)
  {
    setNoCommit(true);
    PreferenceInflater localPreferenceInflater = new androidx/preference/PreferenceInflater;
    localPreferenceInflater.<init>(paramContext, this);
    paramContext = (PreferenceScreen)localPreferenceInflater.OooO0OO(paramInt, paramPreferenceScreen);
    paramContext.OooOOo(this);
    setNoCommit(false);
    return paramContext;
  }
  
  public boolean OooO0o()
  {
    return this.OooO0o ^ true;
  }
  
  public boolean OooO0o0(PreferenceScreen paramPreferenceScreen)
  {
    PreferenceScreen localPreferenceScreen = this.OooOO0;
    if (paramPreferenceScreen != localPreferenceScreen)
    {
      if (localPreferenceScreen != null) {
        localPreferenceScreen.OooOo0o();
      }
      this.OooOO0 = paramPreferenceScreen;
      return true;
    }
    return false;
  }
  
  public void OooO0oO(Preference paramPreference)
  {
    PreferenceManager.OnDisplayPreferenceDialogListener localOnDisplayPreferenceDialogListener = this.OooOOO0;
    if (localOnDisplayPreferenceDialogListener != null) {
      localOnDisplayPreferenceDialogListener.OooOO0O(paramPreference);
    }
  }
  
  public Context getContext()
  {
    return this.OooO00o;
  }
  
  public SharedPreferences.Editor getEditor()
  {
    Object localObject = this.OooO0Oo;
    if (localObject != null) {
      return null;
    }
    boolean bool = this.OooO0o;
    if (bool)
    {
      localObject = this.OooO0o0;
      if (localObject == null)
      {
        localObject = getSharedPreferences().edit();
        this.OooO0o0 = ((SharedPreferences.Editor)localObject);
      }
      return this.OooO0o0;
    }
    return getSharedPreferences().edit();
  }
  
  public long getNextId()
  {
    try
    {
      long l1 = this.OooO0O0;
      long l2 = 1L + l1;
      this.OooO0O0 = l2;
      return l1;
    }
    finally {}
  }
  
  public PreferenceManager.OnDisplayPreferenceDialogListener getOnDisplayPreferenceDialogListener()
  {
    return this.OooOOO0;
  }
  
  public PreferenceManager.OnNavigateToScreenListener getOnNavigateToScreenListener()
  {
    return this.OooOOO;
  }
  
  public PreferenceManager.OnPreferenceTreeClickListener getOnPreferenceTreeClickListener()
  {
    return this.OooOO0o;
  }
  
  public PreferenceManager.PreferenceComparisonCallback getPreferenceComparisonCallback()
  {
    return this.OooOO0O;
  }
  
  public PreferenceDataStore getPreferenceDataStore()
  {
    return this.OooO0Oo;
  }
  
  public PreferenceScreen getPreferenceScreen()
  {
    return this.OooOO0;
  }
  
  public SharedPreferences getSharedPreferences()
  {
    Object localObject = getPreferenceDataStore();
    if (localObject != null) {
      return null;
    }
    localObject = this.OooO0OO;
    if (localObject == null)
    {
      int i = this.OooO;
      int j = 1;
      if (i != j) {
        localObject = this.OooO00o;
      } else {
        localObject = ContextCompat.OooO0O0(this.OooO00o);
      }
      String str = this.OooO0oO;
      int k = this.OooO0oo;
      localObject = ((Context)localObject).getSharedPreferences(str, k);
      this.OooO0OO = ((SharedPreferences)localObject);
    }
    return this.OooO0OO;
  }
  
  public int getSharedPreferencesMode()
  {
    return this.OooO0oo;
  }
  
  public String getSharedPreferencesName()
  {
    return this.OooO0oO;
  }
  
  public boolean isStorageDefault()
  {
    int i = this.OooO;
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isStorageDeviceProtected()
  {
    int i = this.OooO;
    int j = 1;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  public void setOnDisplayPreferenceDialogListener(PreferenceManager.OnDisplayPreferenceDialogListener paramOnDisplayPreferenceDialogListener)
  {
    this.OooOOO0 = paramOnDisplayPreferenceDialogListener;
  }
  
  public void setOnNavigateToScreenListener(PreferenceManager.OnNavigateToScreenListener paramOnNavigateToScreenListener)
  {
    this.OooOOO = paramOnNavigateToScreenListener;
  }
  
  public void setOnPreferenceTreeClickListener(PreferenceManager.OnPreferenceTreeClickListener paramOnPreferenceTreeClickListener)
  {
    this.OooOO0o = paramOnPreferenceTreeClickListener;
  }
  
  public void setPreferenceComparisonCallback(PreferenceManager.PreferenceComparisonCallback paramPreferenceComparisonCallback)
  {
    this.OooOO0O = paramPreferenceComparisonCallback;
  }
  
  public void setPreferenceDataStore(PreferenceDataStore paramPreferenceDataStore)
  {
    this.OooO0Oo = paramPreferenceDataStore;
  }
  
  public void setSharedPreferencesMode(int paramInt)
  {
    this.OooO0oo = paramInt;
    this.OooO0OO = null;
  }
  
  public void setSharedPreferencesName(String paramString)
  {
    this.OooO0oO = paramString;
    this.OooO0OO = null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.PreferenceManager
 * JD-Core Version:    0.7.0.1
 */