package androidx.recyclerview.widget;

import java.lang.reflect.Array;

public class TileList$Tile
{
  public final Object[] OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public Tile OooO0Oo;
  
  public TileList$Tile(Class paramClass, int paramInt)
  {
    paramClass = (Object[])Array.newInstance(paramClass, paramInt);
    this.OooO00o = paramClass;
  }
  
  public boolean OooO00o(int paramInt)
  {
    int i = this.OooO0O0;
    if (i <= paramInt)
    {
      int j = this.OooO0OO;
      i += j;
      if (paramInt < i) {
        return 1;
      }
    }
    paramInt = 0;
    return paramInt;
  }
  
  public Object getByPosition(int paramInt)
  {
    Object[] arrayOfObject = this.OooO00o;
    int i = this.OooO0O0;
    paramInt -= i;
    return arrayOfObject[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.TileList.Tile
 * JD-Core Version:    0.7.0.1
 */