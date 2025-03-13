package androidx.core.provider;

import androidx.collection.SimpleArrayMap;
import androidx.core.util.Consumer;
import java.util.ArrayList;

class FontRequestWorker$4
  implements Consumer
{
  public FontRequestWorker$4(String paramString) {}
  
  public void OooO00o(FontRequestWorker.TypefaceResult paramTypefaceResult)
  {
    synchronized (FontRequestWorker.OooO0OO)
    {
      Object localObject2 = FontRequestWorker.OooO0Oo;
      Object localObject3 = this.o00OoOoo;
      localObject3 = ((SimpleArrayMap)localObject2).get(localObject3);
      localObject3 = (ArrayList)localObject3;
      if (localObject3 == null) {
        return;
      }
      String str = this.o00OoOoo;
      ((SimpleArrayMap)localObject2).remove(str);
      int i = 0;
      ??? = null;
      for (;;)
      {
        int j = ((ArrayList)localObject3).size();
        if (i >= j) {
          break;
        }
        localObject2 = (Consumer)((ArrayList)localObject3).get(i);
        ((Consumer)localObject2).accept(paramTypefaceResult);
        i += 1;
      }
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.FontRequestWorker.4
 * JD-Core Version:    0.7.0.1
 */