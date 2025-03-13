package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;

class BottomSheetDialog$2
  implements View.OnClickListener
{
  public BottomSheetDialog$2(BottomSheetDialog paramBottomSheetDialog) {}
  
  public void onClick(View paramView)
  {
    paramView = this.this$0;
    boolean bool1 = paramView.cancelable;
    if (bool1)
    {
      boolean bool2 = paramView.isShowing();
      if (bool2)
      {
        paramView = this.this$0;
        bool2 = paramView.shouldWindowCloseOnTouchOutside();
        if (bool2)
        {
          paramView = this.this$0;
          paramView.cancel();
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.bottomsheet.BottomSheetDialog.2
 * JD-Core Version:    0.7.0.1
 */