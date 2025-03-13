package androidx.core.util;

public class DebugUtils
{
  public static void OooO00o(Object paramObject, StringBuilder paramStringBuilder)
  {
    if (paramObject == null) {}
    int j;
    for (paramObject = "null";; paramObject = Integer.toHexString(j))
    {
      paramStringBuilder.append(paramObject);
      break;
      String str = paramObject.getClass().getSimpleName();
      int i = str.length();
      if (i <= 0)
      {
        str = paramObject.getClass().getName();
        i = str.lastIndexOf('.');
        if (i > 0)
        {
          i += 1;
          str = str.substring(i);
        }
      }
      paramStringBuilder.append(str);
      char c = '{';
      paramStringBuilder.append(c);
      j = System.identityHashCode(paramObject);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.util.DebugUtils
 * JD-Core Version:    0.7.0.1
 */