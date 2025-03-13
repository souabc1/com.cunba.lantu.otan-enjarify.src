package androidx.core.view;

public final class WindowInsetsCompat$Type
{
  public static int OooO00o()
  {
    return 8;
  }
  
  public static int OooO0O0(int paramInt)
  {
    int i = 1;
    if (paramInt != i)
    {
      int j = 2;
      if (paramInt != j)
      {
        i = 4;
        if (paramInt != i)
        {
          j = 8;
          if (paramInt != j)
          {
            int k = 16;
            if (paramInt != k)
            {
              i = 32;
              if (paramInt != i)
              {
                i = 64;
                if (paramInt != i)
                {
                  i = 128;
                  if (paramInt != i)
                  {
                    i = 256;
                    if (paramInt == i) {
                      return j;
                    }
                    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
                    StringBuilder localStringBuilder = new java/lang/StringBuilder;
                    localStringBuilder.<init>();
                    localStringBuilder.append("type needs to be >= FIRST and <= LAST, type=");
                    localStringBuilder.append(paramInt);
                    String str = localStringBuilder.toString();
                    localIllegalArgumentException.<init>(str);
                    throw localIllegalArgumentException;
                  }
                  return 7;
                }
                return 6;
              }
              return 5;
            }
            return i;
          }
          return 3;
        }
        return j;
      }
      return i;
    }
    return 0;
  }
  
  public static int OooO0OO()
  {
    return 32;
  }
  
  public static int OooO0Oo()
  {
    return 7;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.Type
 * JD-Core Version:    0.7.0.1
 */