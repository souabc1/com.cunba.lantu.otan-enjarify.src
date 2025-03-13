package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import androidx.appcompat.widget.TintTypedArray;

public final class ExpandedMenuView
  extends ListView
  implements MenuBuilder.ItemInvoker, MenuView, AdapterView.OnItemClickListener
{
  public static final int[] o00Ooo0 = { 16842964, 16843049 };
  public MenuBuilder o00OoOoo;
  public int o00Ooo00;
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842868);
  }
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    int[] arrayOfInt = o00Ooo0;
    paramContext = TintTypedArray.OooOOOO(paramContext, paramAttributeSet, arrayOfInt, paramInt, 0);
    int i = paramContext.OooOO0o(0);
    if (i != 0)
    {
      paramAttributeSet = paramContext.getDrawable(0);
      setBackgroundDrawable(paramAttributeSet);
    }
    i = 1;
    paramInt = paramContext.OooOO0o(i);
    if (paramInt != 0)
    {
      paramAttributeSet = paramContext.getDrawable(i);
      setDivider(paramAttributeSet);
    }
    paramContext.OooOOOo();
  }
  
  public boolean OooO00o(MenuItemImpl paramMenuItemImpl)
  {
    return this.o00OoOoo.performItemAction(paramMenuItemImpl, 0);
  }
  
  public int getWindowAnimations()
  {
    return this.o00Ooo00;
  }
  
  public void initialize(MenuBuilder paramMenuBuilder)
  {
    this.o00OoOoo = paramMenuBuilder;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (MenuItemImpl)getAdapter().getItem(paramInt);
    OooO00o(paramAdapterView);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.ExpandedMenuView
 * JD-Core Version:    0.7.0.1
 */