package androidx.core.content.pm;

import java.util.List;

public class ShortcutManagerCompat
{
  public static volatile ShortcutInfoCompatSaver OooO00o;
  public static volatile List OooO0O0;
  
  public static List getShortcutInfoChangeListeners()
  {
    return OooO0O0;
  }
  
  public static void setShortcutInfoChangeListeners(List paramList)
  {
    OooO0O0 = paramList;
  }
  
  public static void setShortcutInfoCompatSaver(ShortcutInfoCompatSaver paramShortcutInfoCompatSaver)
  {
    OooO00o = paramShortcutInfoCompatSaver;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.pm.ShortcutManagerCompat
 * JD-Core Version:    0.7.0.1
 */