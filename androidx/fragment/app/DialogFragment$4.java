package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

class DialogFragment$4
  implements Observer
{
  public DialogFragment$4(DialogFragment paramDialogFragment) {}
  
  public void OooO0O0(LifecycleOwner paramLifecycleOwner)
  {
    if (paramLifecycleOwner != null)
    {
      paramLifecycleOwner = this.OooO00o;
      boolean bool1 = DialogFragment.access$200(paramLifecycleOwner);
      if (bool1)
      {
        paramLifecycleOwner = this.OooO00o.requireView();
        Object localObject = paramLifecycleOwner.getParent();
        if (localObject == null)
        {
          localObject = DialogFragment.access$000(this.OooO00o);
          if (localObject != null)
          {
            boolean bool2 = FragmentManager.isLoggingEnabled(3);
            if (bool2)
            {
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>();
              ((StringBuilder)localObject).append("DialogFragment ");
              ((StringBuilder)localObject).append(this);
              ((StringBuilder)localObject).append(" setting the content view on ");
              Dialog localDialog = DialogFragment.access$000(this.OooO00o);
              ((StringBuilder)localObject).append(localDialog);
            }
            localObject = DialogFragment.access$000(this.OooO00o);
            ((Dialog)localObject).setContentView(paramLifecycleOwner);
          }
        }
        else
        {
          paramLifecycleOwner = new java/lang/IllegalStateException;
          paramLifecycleOwner.<init>("DialogFragment can not be attached to a container view");
          throw paramLifecycleOwner;
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.DialogFragment.4
 * JD-Core Version:    0.7.0.1
 */