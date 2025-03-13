package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.view.LayoutInflater;
import androidx.appcompat.R.style;

public class ContextThemeWrapper
  extends ContextWrapper
{
  public static Configuration OooO0o;
  public int OooO00o;
  public Resources.Theme OooO0O0;
  public LayoutInflater OooO0OO;
  public Configuration OooO0Oo;
  public Resources OooO0o0;
  
  public ContextThemeWrapper()
  {
    super(null);
  }
  
  public ContextThemeWrapper(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.OooO00o = paramInt;
  }
  
  public ContextThemeWrapper(Context paramContext, Resources.Theme paramTheme)
  {
    super(paramContext);
    this.OooO0O0 = paramTheme;
  }
  
  public static boolean OooO0OO(Configuration paramConfiguration)
  {
    if (paramConfiguration == null) {
      return true;
    }
    Configuration localConfiguration = OooO0o;
    if (localConfiguration == null)
    {
      localConfiguration = new android/content/res/Configuration;
      localConfiguration.<init>();
      localConfiguration.fontScale = 0.0F;
      OooO0o = localConfiguration;
    }
    localConfiguration = OooO0o;
    return paramConfiguration.equals(localConfiguration);
  }
  
  private Resources getResourcesInternal()
  {
    Object localObject = this.OooO0o0;
    if (localObject == null)
    {
      localObject = this.OooO0Oo;
      if (localObject != null)
      {
        boolean bool = OooO0OO((Configuration)localObject);
        if (!bool)
        {
          localObject = this.OooO0Oo;
          localObject = ContextThemeWrapper.Api17Impl.OooO00o(this, (Configuration)localObject).getResources();
          break label52;
        }
      }
      localObject = super.getResources();
      label52:
      this.OooO0o0 = ((Resources)localObject);
    }
    return this.OooO0o0;
  }
  
  public void OooO00o(Configuration paramConfiguration)
  {
    Object localObject = this.OooO0o0;
    if (localObject == null)
    {
      localObject = this.OooO0Oo;
      if (localObject == null)
      {
        localObject = new android/content/res/Configuration;
        ((Configuration)localObject).<init>(paramConfiguration);
        this.OooO0Oo = ((Configuration)localObject);
        return;
      }
      paramConfiguration = new java/lang/IllegalStateException;
      paramConfiguration.<init>("Override configuration has already been set");
      throw paramConfiguration;
    }
    paramConfiguration = new java/lang/IllegalStateException;
    paramConfiguration.<init>("getResources() or getAssets() has already been called");
    throw paramConfiguration;
  }
  
  public final void OooO0O0()
  {
    Resources.Theme localTheme1 = this.OooO0O0;
    boolean bool;
    if (localTheme1 == null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localTheme1 = null;
    }
    if (bool)
    {
      localTheme2 = getResources().newTheme();
      this.OooO0O0 = localTheme2;
      localTheme2 = getBaseContext().getTheme();
      if (localTheme2 != null)
      {
        Resources.Theme localTheme3 = this.OooO0O0;
        localTheme3.setTo(localTheme2);
      }
    }
    Resources.Theme localTheme2 = this.OooO0O0;
    int i = this.OooO00o;
    OooO0Oo(localTheme2, i, bool);
  }
  
  public void OooO0Oo(Resources.Theme paramTheme, int paramInt, boolean paramBoolean)
  {
    paramTheme.applyStyle(paramInt, true);
  }
  
  public void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
  }
  
  public AssetManager getAssets()
  {
    return getResources().getAssets();
  }
  
  public Resources getResources()
  {
    return getResourcesInternal();
  }
  
  public Object getSystemService(String paramString)
  {
    String str = "layout_inflater";
    boolean bool = str.equals(paramString);
    if (bool)
    {
      paramString = this.OooO0OO;
      if (paramString == null)
      {
        paramString = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        this.OooO0OO = paramString;
      }
      return this.OooO0OO;
    }
    return getBaseContext().getSystemService(paramString);
  }
  
  public Resources.Theme getTheme()
  {
    Resources.Theme localTheme = this.OooO0O0;
    if (localTheme != null) {
      return localTheme;
    }
    int i = this.OooO00o;
    if (i == 0)
    {
      i = R.style.Theme_AppCompat_Light;
      this.OooO00o = i;
    }
    OooO0O0();
    return this.OooO0O0;
  }
  
  public int getThemeResId()
  {
    return this.OooO00o;
  }
  
  public void setTheme(int paramInt)
  {
    int i = this.OooO00o;
    if (i != paramInt)
    {
      this.OooO00o = paramInt;
      OooO0O0();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.ContextThemeWrapper
 * JD-Core Version:    0.7.0.1
 */