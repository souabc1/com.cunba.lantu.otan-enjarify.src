package androidx.transition;

import java.util.ArrayList;

class Transition$ArrayListManager
{
  public static ArrayList OooO00o(ArrayList paramArrayList, Object paramObject)
  {
    if (paramArrayList == null)
    {
      paramArrayList = new java/util/ArrayList;
      paramArrayList.<init>();
    }
    boolean bool = paramArrayList.contains(paramObject);
    if (!bool) {
      paramArrayList.add(paramObject);
    }
    return paramArrayList;
  }
  
  public static ArrayList OooO0O0(ArrayList paramArrayList, Object paramObject)
  {
    if (paramArrayList != null)
    {
      paramArrayList.remove(paramObject);
      boolean bool = paramArrayList.isEmpty();
      if (bool) {
        paramArrayList = null;
      }
    }
    return paramArrayList;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.Transition.ArrayListManager
 * JD-Core Version:    0.7.0.1
 */