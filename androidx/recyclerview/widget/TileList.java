package androidx.recyclerview.widget;

import android.util.SparseArray;

class TileList
{
  public final int OooO00o;
  public final SparseArray OooO0O0;
  public TileList.Tile OooO0OO;
  
  public TileList.Tile OooO00o(TileList.Tile paramTile)
  {
    Object localObject = this.OooO0O0;
    int i = paramTile.OooO0O0;
    int j = ((SparseArray)localObject).indexOfKey(i);
    if (j < 0)
    {
      localObject = this.OooO0O0;
      i = paramTile.OooO0O0;
      ((SparseArray)localObject).put(i, paramTile);
      return null;
    }
    TileList.Tile localTile = (TileList.Tile)this.OooO0O0.valueAt(j);
    SparseArray localSparseArray = this.OooO0O0;
    localSparseArray.setValueAt(j, paramTile);
    localObject = this.OooO0OO;
    if (localObject == localTile) {
      this.OooO0OO = paramTile;
    }
    return localTile;
  }
  
  public void OooO0O0()
  {
    this.OooO0O0.clear();
  }
  
  public TileList.Tile OooO0OO(int paramInt)
  {
    TileList.Tile localTile1 = (TileList.Tile)this.OooO0O0.get(paramInt);
    TileList.Tile localTile2 = this.OooO0OO;
    if (localTile2 == localTile1)
    {
      localTile2 = null;
      this.OooO0OO = null;
    }
    this.OooO0O0.delete(paramInt);
    return localTile1;
  }
  
  public int OooO0Oo()
  {
    return this.OooO0O0.size();
  }
  
  public TileList.Tile getAtIndex(int paramInt)
  {
    if (paramInt >= 0)
    {
      SparseArray localSparseArray = this.OooO0O0;
      int i = localSparseArray.size();
      if (paramInt < i) {
        return (TileList.Tile)this.OooO0O0.valueAt(paramInt);
      }
    }
    return null;
  }
  
  public Object getItemAt(int paramInt)
  {
    TileList.Tile localTile = this.OooO0OO;
    if (localTile != null)
    {
      boolean bool = localTile.OooO00o(paramInt);
      if (bool) {}
    }
    else
    {
      int i = this.OooO00o;
      i = paramInt % i;
      i = paramInt - i;
      SparseArray localSparseArray = this.OooO0O0;
      i = localSparseArray.indexOfKey(i);
      if (i < 0) {
        return null;
      }
      localSparseArray = this.OooO0O0;
      localTile = (TileList.Tile)localSparseArray.valueAt(i);
      this.OooO0OO = localTile;
    }
    return this.OooO0OO.getByPosition(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.TileList
 * JD-Core Version:    0.7.0.1
 */