package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.Editable.Factory;
import androidx.emoji2.text.SpannableBuilder;

final class EmojiEditableFactory
  extends Editable.Factory
{
  public static final Object OooO00o;
  public static volatile Editable.Factory OooO0O0;
  public static Class OooO0OO;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO00o = localObject;
  }
  
  private EmojiEditableFactory()
  {
    Object localObject1 = "android.text.DynamicLayout$ChangeWatcher";
    Object localObject2 = EmojiEditableFactory.class;
    try
    {
      localObject2 = ((Class)localObject2).getClassLoader();
      localObject1 = Class.forName((String)localObject1, false, (ClassLoader)localObject2);
      OooO0OO = (Class)localObject1;
      label26:
      return;
    }
    finally
    {
      break label26;
    }
  }
  
  public static Editable.Factory getInstance()
  {
    ??? = OooO0O0;
    if (??? == null) {
      synchronized (OooO00o)
      {
        Object localObject2 = OooO0O0;
        if (localObject2 == null)
        {
          localObject2 = new androidx/emoji2/viewsintegration/EmojiEditableFactory;
          ((EmojiEditableFactory)localObject2).<init>();
          OooO0O0 = (Editable.Factory)localObject2;
        }
      }
    }
    return OooO0O0;
  }
  
  public Editable newEditable(CharSequence paramCharSequence)
  {
    Class localClass = OooO0OO;
    if (localClass != null) {
      return SpannableBuilder.OooO0OO(localClass, paramCharSequence);
    }
    return super.newEditable(paramCharSequence);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiEditableFactory
 * JD-Core Version:    0.7.0.1
 */