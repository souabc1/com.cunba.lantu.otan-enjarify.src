package androidx.appcompat.app;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

class AlertController$1
  implements View.OnClickListener
{
  public AlertController$1(AlertController paramAlertController) {}
  
  public void onClick(View paramView)
  {
    Object localObject1 = this.o00OoOoo;
    Object localObject2 = ((AlertController)localObject1).OooOOOO;
    if (paramView == localObject2)
    {
      localObject2 = ((AlertController)localObject1).OooOOo0;
      if (localObject2 == null) {}
    }
    do
    {
      paramView = Message.obtain((Message)localObject2);
      break label83;
      localObject2 = ((AlertController)localObject1).OooOOoo;
      if (paramView != localObject2) {
        break;
      }
      localObject2 = ((AlertController)localObject1).OooOo0;
    } while (localObject2 != null);
    localObject2 = ((AlertController)localObject1).OooOo0o;
    if (paramView == localObject2)
    {
      paramView = ((AlertController)localObject1).OooOoO0;
      if (paramView != null)
      {
        paramView = Message.obtain(paramView);
        break label83;
      }
    }
    paramView = null;
    label83:
    if (paramView != null) {
      paramView.sendToTarget();
    }
    paramView = this.o00OoOoo;
    localObject1 = paramView.OoooO0;
    paramView = paramView.OooO0O0;
    ((Handler)localObject1).obtainMessage(1, paramView).sendToTarget();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AlertController.1
 * JD-Core Version:    0.7.0.1
 */