package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;

public final class SetUserVisibleHintViolation
  extends Violation
{
  public final boolean o00Ooo00;
  
  public SetUserVisibleHintViolation(Fragment paramFragment, boolean paramBoolean)
  {
    super(paramFragment, (String)localObject);
    this.o00Ooo00 = paramBoolean;
  }
  
  public final boolean isVisibleToUser()
  {
    return this.o00Ooo00;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.strictmode.SetUserVisibleHintViolation
 * JD-Core Version:    0.7.0.1
 */