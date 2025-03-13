package androidx.fragment.app;

import android.view.View;

class DialogFragment$5
  extends FragmentContainer
{
  public DialogFragment$5(DialogFragment paramDialogFragment, FragmentContainer paramFragmentContainer) {}
  
  public View OooO0OO(int paramInt)
  {
    FragmentContainer localFragmentContainer = this.o00OoOoo;
    boolean bool = localFragmentContainer.OooO0o0();
    if (bool) {
      return this.o00OoOoo.OooO0OO(paramInt);
    }
    return this.o00Ooo00.onFindViewById(paramInt);
  }
  
  public boolean OooO0o0()
  {
    Object localObject = this.o00OoOoo;
    boolean bool = ((FragmentContainer)localObject).OooO0o0();
    if (!bool)
    {
      localObject = this.o00Ooo00;
      bool = ((DialogFragment)localObject).onHasView();
      if (!bool)
      {
        bool = false;
        localObject = null;
        return bool;
      }
    }
    bool = true;
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.DialogFragment.5
 * JD-Core Version:    0.7.0.1
 */