package com.just.agentweb.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.just.agentweb.core.client.MiddlewareWebChromeBase;
import com.just.agentweb.core.client.MiddlewareWebClientBase;
import com.just.agentweb.js.JsCallJava;
import com.just.agentweb.utils.LogUtils;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import m54207b69;

public class AgentWebView
  extends WebView
{
  public static final String o00OooO0 = "AgentWebView";
  public Map o00OoOoo;
  public AgentWebView.FixedOnReceivedTitle o00Ooo0;
  public Map o00Ooo00;
  public boolean o00Ooo0O;
  public Boolean o00Ooo0o;
  
  public AgentWebView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AgentWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    OooOOO();
    this.o00Ooo0O = true;
    paramContext = new com/just/agentweb/widget/AgentWebView$FixedOnReceivedTitle;
    paramContext.<init>(null);
    this.o00Ooo0 = paramContext;
  }
  
  public static Pair OooOO0o(Throwable paramThrowable)
  {
    Object localObject1 = paramThrowable.getCause();
    if (localObject1 == null) {
      localObject1 = paramThrowable.toString();
    } else {
      localObject1 = paramThrowable.getCause().toString();
    }
    Object localObject2 = Log.getStackTraceString(paramThrowable);
    Object localObject3 = m54207b69.F54207b69_11(">=5C545B5256595F1A665B5D54646057225D61258070736C7372718A776F7978776F3A957F747D997971A47C737F86A6748E897F7C888789");
    boolean bool1 = ((String)localObject2).contains((CharSequence)localObject3);
    if (!bool1)
    {
      localObject3 = m54207b69.F54207b69_11("}P3A322834824137453F870C304A31474C45263A4649353A505757848B2F4E5C5D5F45925F63565A972F5E5C31656255");
      bool1 = ((String)localObject2).contains((CharSequence)localObject3);
      if (!bool1)
      {
        localObject3 = m54207b69.F54207b69_11("14555B52495F6256214B5A606A694D2872616774706558886C6F597561692D977C67687F7D7788777D8A867B6E9082858E858483A4808C877B789695954A51B0949D9993935885A15BA0A49F9B60B09FA5B2AEA39668999CB29AB6AAACA26B72D9BB75C5B4BAC7C3B8AB7DC7C5B3ADC3C7C8C2C2");
        boolean bool2 = ((String)localObject2).contains((CharSequence)localObject3);
        if (!bool2)
        {
          paramThrowable = new android/util/Pair;
          localObject2 = Boolean.FALSE;
          paramThrowable.<init>(localObject2, localObject1);
          return paramThrowable;
        }
      }
    }
    localObject2 = o00OooO0;
    localObject3 = m54207b69.F54207b69_11("+*435A7F524C814956658355544D585B5E7F635B626E73595C5C");
    LogUtils.OooO0Oo((String)localObject2, (String)localObject3, paramThrowable);
    paramThrowable = new android/util/Pair;
    localObject2 = Boolean.TRUE;
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    String str = m54207b69.F54207b69_11("&_083B3F0C3A3F2E863B3948468B464C45434B4D8693");
    ((StringBuilder)localObject3).append(str);
    ((StringBuilder)localObject3).append((String)localObject1);
    localObject1 = ((StringBuilder)localObject3).toString();
    paramThrowable.<init>(localObject2, localObject1);
    return paramThrowable;
  }
  
  private boolean isAccessibilityEnabled()
  {
    Context localContext = getContext();
    String str = m54207b69.F54207b69_11("dM2C2F302B42432A362C2A2E4440");
    return ((AccessibilityManager)localContext.getSystemService(str)).isEnabled();
  }
  
  private void setAccessibilityEnabled(boolean paramBoolean)
  {
    Object localObject1 = getContext();
    Object localObject2 = m54207b69.F54207b69_11("dM2C2F302B42432A362C2A2E4440");
    localObject1 = (AccessibilityManager)((Context)localObject1).getSystemService((String)localObject2);
    try
    {
      localObject2 = localObject1.getClass();
      Object localObject3 = "r'544355694849485B5C574F59575B616D8464586656";
      localObject3 = m54207b69.F54207b69_11((String)localObject3);
      boolean bool1 = true;
      Class[] arrayOfClass = new Class[bool1];
      Class localClass = Boolean.TYPE;
      arrayOfClass[0] = localClass;
      localObject2 = ((Class)localObject2).getDeclaredMethod((String)localObject3, arrayOfClass);
      ((AccessibleObject)localObject2).setAccessible(bool1);
      localObject3 = new Object[bool1];
      Boolean localBoolean = Boolean.valueOf(paramBoolean);
      localObject3[0] = localBoolean;
      ((Method)localObject2).invoke(localObject1, (Object[])localObject3);
      ((AccessibleObject)localObject2).setAccessible(false);
    }
    finally
    {
      boolean bool2 = LogUtils.isDebug();
      if (bool2)
      {
        localObject1 = o00OooO0;
        localObject2 = m54207b69.F54207b69_11("+\\2F3A2A2043443F36373E48403C42363429434F51444E4E");
        LogUtils.OooO0O0((String)localObject1, (String)localObject2, localThrowable);
      }
    }
  }
  
  public final void OooO()
  {
    Object localObject = getParent();
    boolean bool = localObject instanceof ViewGroup;
    if (bool)
    {
      localObject = (ViewGroup)getParent();
      ((ViewGroup)localObject).removeAllViewsInLayout();
    }
  }
  
  public String OooO0oO(String paramString1, String paramString2)
  {
    Object localObject = m54207b69.F54207b69_11("9.7172494348505361704B59547D182D196D8283");
    paramString1 = new Object[] { paramString1 };
    paramString1 = String.format((String)localObject, paramString1);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("a>54604A625162525E56530E5558545325685C62705E6C67672E305F7274336776707B736C34");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramString1);
    str = m54207b69.F54207b69_11("?I60332C292B3F2C2C34702F313A6E7C");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramString1);
    str = m54207b69.F54207b69_11("eS733C342377363C3D457C444845433E364648868D7C364C3E3E3A57834A41585C575D46A0");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramString1);
    paramString1 = m54207b69.F54207b69_11("N$195158544524");
    ((StringBuilder)localObject).append(paramString1);
    ((StringBuilder)localObject).append(paramString2);
    paramString1 = m54207b69.F54207b69_11("QJ376365663B2E3145312B6C3A6F3E3734344A373943795342503D7C4A7F54");
    ((StringBuilder)localObject).append(paramString1);
    return ((StringBuilder)localObject).toString();
  }
  
  public void OooO0oo(String paramString) {}
  
  public final void OooOO0()
  {
    Iterator localIterator = this.o00Ooo00.entrySet().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      localObject = OooO0oO(str, (String)localObject);
      loadUrl((String)localObject);
    }
  }
  
  public final void OooOO0O()
  {
    Iterator localIterator = this.o00OoOoo.entrySet().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = ((JsCallJava)((Map.Entry)localObject).getValue()).getPreloadInterfaceJs();
      localObject = OooO0oO(str, (String)localObject);
      loadUrl((String)localObject);
    }
  }
  
  public boolean OooOOO()
  {
    return false;
  }
  
  public final void OooOOO0() {}
  
  public final void OooOOOO()
  {
    Boolean localBoolean = this.o00Ooo0o;
    if (localBoolean != null)
    {
      boolean bool = localBoolean.booleanValue();
      setAccessibilityEnabled(bool);
    }
  }
  
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    super.addJavascriptInterface(paramObject, paramString);
  }
  
  public void clearHistory()
  {
    boolean bool = this.o00Ooo0O;
    if (bool) {
      super.clearHistory();
    }
  }
  
  public void destroy()
  {
    int i = 8;
    setVisibility(i);
    Object localObject = this.o00OoOoo;
    if (localObject != null) {
      ((Map)localObject).clear();
    }
    localObject = this.o00Ooo00;
    if (localObject != null) {
      ((Map)localObject).clear();
    }
    removeAllViewsInLayout();
    OooO();
    OooOOO0();
    boolean bool = this.o00Ooo0O;
    if (bool)
    {
      OooOOOO();
      localObject = o00OooO0;
      String str = m54207b69.F54207b69_11("+256584349446251194D605A");
      LogUtils.OooO0OO((String)localObject, str);
      super.destroy();
    }
  }
  
  public boolean isPrivateBrowsingEnabled()
  {
    return super.isPrivateBrowsingEnabled();
  }
  
  /* Error */
  public void setOverScrollMode(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokespecial 291	android/webkit/WebView:setOverScrollMode	(I)V
    //   5: goto +64 -> 69
    //   8: astore_2
    //   9: aload_2
    //   10: invokestatic 295	com/just/agentweb/widget/AgentWebView:OooOO0o	(Ljava/lang/Throwable;)Landroid/util/Pair;
    //   13: astore_3
    //   14: aload_3
    //   15: getfield 299	android/util/Pair:first	Ljava/lang/Object;
    //   18: checkcast 88	java/lang/Boolean
    //   21: astore 4
    //   23: aload 4
    //   25: invokevirtual 249	java/lang/Boolean:booleanValue	()Z
    //   28: istore 5
    //   30: iload 5
    //   32: ifeq +38 -> 70
    //   35: aload_0
    //   36: invokevirtual 122	android/view/View:getContext	()Landroid/content/Context;
    //   39: astore_2
    //   40: aload_3
    //   41: getfield 302	android/util/Pair:second	Ljava/lang/Object;
    //   44: checkcast 304	java/lang/CharSequence
    //   47: astore_3
    //   48: iconst_0
    //   49: istore 5
    //   51: aconst_null
    //   52: astore 4
    //   54: aload_2
    //   55: aload_3
    //   56: iconst_0
    //   57: invokestatic 310	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   60: astore_2
    //   61: aload_2
    //   62: invokevirtual 313	android/widget/Toast:show	()V
    //   65: aload_0
    //   66: invokevirtual 314	com/just/agentweb/widget/AgentWebView:destroy	()V
    //   69: return
    //   70: aload_2
    //   71: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	AgentWebView
    //   0	72	1	paramInt	int
    //   8	2	2	localThrowable	Throwable
    //   39	32	2	localObject1	Object
    //   13	43	3	localObject2	Object
    //   21	32	4	localBoolean	Boolean
    //   28	22	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   1	5	8	finally
  }
  
  public final void setWebChromeClient(WebChromeClient paramWebChromeClient)
  {
    AgentWebView.AgentWebChrome localAgentWebChrome = new com/just/agentweb/widget/AgentWebView$AgentWebChrome;
    localAgentWebChrome.<init>(this, null);
    localAgentWebChrome.setDelegate(paramWebChromeClient);
    this.o00Ooo0.setWebChromeClient(paramWebChromeClient);
    super.setWebChromeClient(localAgentWebChrome);
    setWebChromeClientSupport(localAgentWebChrome);
  }
  
  public final void setWebChromeClientSupport(WebChromeClient paramWebChromeClient) {}
  
  public final void setWebViewClient(WebViewClient paramWebViewClient)
  {
    AgentWebView.AgentWebClient localAgentWebClient = new com/just/agentweb/widget/AgentWebView$AgentWebClient;
    localAgentWebClient.<init>(this, null);
    localAgentWebClient.setDelegate(paramWebViewClient);
    super.setWebViewClient(localAgentWebClient);
    setWebViewClientSupport(localAgentWebClient);
  }
  
  public final void setWebViewClientSupport(WebViewClient paramWebViewClient) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.widget.AgentWebView
 * JD-Core Version:    0.7.0.1
 */