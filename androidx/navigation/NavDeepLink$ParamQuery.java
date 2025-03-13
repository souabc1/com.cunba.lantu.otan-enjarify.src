package androidx.navigation;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

final class NavDeepLink$ParamQuery
{
  public String OooO00o;
  public final List OooO0O0;
  
  public NavDeepLink$ParamQuery()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0O0 = localArrayList;
  }
  
  public final void OooO00o(String paramString)
  {
    Intrinsics.OooO0o(paramString, "name");
    this.OooO0O0.add(paramString);
  }
  
  public final String getArgumentName(int paramInt)
  {
    return (String)this.OooO0O0.get(paramInt);
  }
  
  public final List getArguments()
  {
    return this.OooO0O0;
  }
  
  public final String getParamRegex()
  {
    return this.OooO00o;
  }
  
  public final void setParamRegex(String paramString)
  {
    this.OooO00o = paramString;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavDeepLink.ParamQuery
 * JD-Core Version:    0.7.0.1
 */