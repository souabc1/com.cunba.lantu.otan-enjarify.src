package com.google.android.material.sidesheet;

abstract interface Sheet
{
  public static final int EDGE_RIGHT = 0;
  public static final int STATE_DRAGGING = 1;
  public static final int STATE_EXPANDED = 3;
  public static final int STATE_HIDDEN = 5;
  public static final int STATE_SETTLING = 2;
  
  public abstract void addCallback(SheetCallback paramSheetCallback);
  
  public abstract int getState();
  
  public abstract void removeCallback(SheetCallback paramSheetCallback);
  
  public abstract void setState(int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.sidesheet.Sheet
 * JD-Core Version:    0.7.0.1
 */