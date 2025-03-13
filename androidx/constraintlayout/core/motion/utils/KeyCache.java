package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import java.util.HashMap;

public class KeyCache
{
  public HashMap OooO00o;
  
  public KeyCache()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO00o = localHashMap;
  }
  
  public float OooO00o(Object paramObject, String paramString, int paramInt)
  {
    HashMap localHashMap = this.OooO00o;
    boolean bool = localHashMap.containsKey(paramObject);
    float f = 0.0F / 0.0F;
    if (!bool) {
      return f;
    }
    localHashMap = this.OooO00o;
    paramObject = (HashMap)localHashMap.get(paramObject);
    if (paramObject != null)
    {
      bool = paramObject.containsKey(paramString);
      if (bool)
      {
        paramObject = (float[])paramObject.get(paramString);
        if (paramObject == null) {
          return f;
        }
        int i = paramObject.length;
        if (i > paramInt) {
          return paramObject[paramInt];
        }
      }
    }
    return f;
  }
  
  public void OooO0O0(Object paramObject, String paramString, int paramInt, float paramFloat)
  {
    HashMap localHashMap = this.OooO00o;
    boolean bool1 = localHashMap.containsKey(paramObject);
    float[] arrayOfFloat;
    if (!bool1)
    {
      localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      int i = paramInt + 1;
      arrayOfFloat = new float[i];
      arrayOfFloat[paramInt] = paramFloat;
      localHashMap.put(paramString, arrayOfFloat);
    }
    for (;;)
    {
      paramString = this.OooO00o;
      paramString.put(paramObject, localHashMap);
      return;
      localHashMap = (HashMap)this.OooO00o.get(paramObject);
      if (localHashMap == null)
      {
        localHashMap = new java/util/HashMap;
        localHashMap.<init>();
      }
      boolean bool2 = localHashMap.containsKey(paramString);
      if (bool2) {
        break;
      }
      j = paramInt + 1;
      arrayOfFloat = new float[j];
      arrayOfFloat[paramInt] = paramFloat;
      localHashMap.put(paramString, arrayOfFloat);
    }
    paramObject = (float[])localHashMap.get(paramString);
    if (paramObject == null) {
      paramObject = new float[0];
    }
    int j = paramObject.length;
    if (j <= paramInt)
    {
      j = paramInt + 1;
      paramObject = Arrays.copyOf(paramObject, j);
    }
    paramObject[paramInt] = paramFloat;
    localHashMap.put(paramString, paramObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.KeyCache
 * JD-Core Version:    0.7.0.1
 */