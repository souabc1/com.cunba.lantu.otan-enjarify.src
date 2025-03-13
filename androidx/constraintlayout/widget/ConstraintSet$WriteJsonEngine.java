package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import java.util.HashMap;

class ConstraintSet$WriteJsonEngine
{
  public Context OooO00o;
  public int OooO0O0;
  public HashMap OooO0OO;
  
  public String OooO00o(int paramInt)
  {
    int i = -1;
    String str = "unknown";
    if (paramInt != i) {}
    try
    {
      Object localObject = this.OooO00o;
      localObject = ((Context)localObject).getResources();
      return ((Resources)localObject).getResourceEntryName(paramInt);
    }
    catch (Exception localException)
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(str);
      i = this.OooO0O0 + 1;
      this.OooO0O0 = i;
      localStringBuilder.append(i);
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(str);
    i = this.OooO0O0 + 1;
    this.OooO0O0 = i;
    localStringBuilder.append(i);
    return localStringBuilder.toString();
    return localStringBuilder.toString();
  }
  
  public String getName(int paramInt)
  {
    Object localObject1 = this.OooO0OO;
    Object localObject2 = Integer.valueOf(paramInt);
    boolean bool = ((HashMap)localObject1).containsKey(localObject2);
    localObject2 = "'";
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append((String)localObject2);
      localHashMap = this.OooO0OO;
      localObject3 = Integer.valueOf(paramInt);
      localObject3 = (String)localHashMap.get(localObject3);
      ((StringBuilder)localObject1).append((String)localObject3);
      ((StringBuilder)localObject1).append((String)localObject2);
      return ((StringBuilder)localObject1).toString();
    }
    if (paramInt == 0) {
      return "'parent'";
    }
    localObject1 = OooO00o(paramInt);
    HashMap localHashMap = this.OooO0OO;
    Object localObject3 = Integer.valueOf(paramInt);
    localHashMap.put(localObject3, localObject1);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    ((StringBuilder)localObject3).append((String)localObject2);
    ((StringBuilder)localObject3).append((String)localObject1);
    ((StringBuilder)localObject3).append((String)localObject2);
    return ((StringBuilder)localObject3).toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintSet.WriteJsonEngine
 * JD-Core Version:    0.7.0.1
 */