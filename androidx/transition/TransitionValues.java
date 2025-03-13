package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TransitionValues
{
  public final Map OooO00o;
  public View OooO0O0;
  public final ArrayList OooO0OO;
  
  public TransitionValues()
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO00o = ((Map)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO0OO = ((ArrayList)localObject);
  }
  
  public TransitionValues(View paramView)
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO00o = ((Map)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO0OO = ((ArrayList)localObject);
    this.OooO0O0 = paramView;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof TransitionValues;
    if (bool1)
    {
      Object localObject = this.OooO0O0;
      paramObject = (TransitionValues)paramObject;
      View localView = paramObject.OooO0O0;
      if (localObject == localView)
      {
        localObject = this.OooO00o;
        paramObject = paramObject.OooO00o;
        boolean bool2 = ((Map)localObject).equals(paramObject);
        if (bool2) {
          return true;
        }
      }
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = this.OooO0O0.hashCode() * 31;
    int j = this.OooO00o.hashCode();
    return i + j;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("TransitionValues@");
    int i = hashCode();
    Object localObject2 = Integer.toHexString(i);
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(":\n");
    localObject1 = ((StringBuilder)localObject1).toString();
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append("    view = ");
    localObject1 = this.OooO0O0;
    ((StringBuilder)localObject2).append(localObject1);
    localObject1 = "\n";
    ((StringBuilder)localObject2).append((String)localObject1);
    localObject2 = ((StringBuilder)localObject2).toString();
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    ((StringBuilder)localObject3).append((String)localObject2);
    ((StringBuilder)localObject3).append("    values:");
    localObject2 = ((StringBuilder)localObject3).toString();
    localObject3 = this.OooO00o.keySet().iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject3).hasNext();
      if (!bool) {
        break;
      }
      String str = (String)((Iterator)localObject3).next();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append("    ");
      localStringBuilder.append(str);
      localStringBuilder.append(": ");
      localObject2 = this.OooO00o.get(str);
      localStringBuilder.append(localObject2);
      localStringBuilder.append((String)localObject1);
      localObject2 = localStringBuilder.toString();
    }
    return localObject2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.TransitionValues
 * JD-Core Version:    0.7.0.1
 */