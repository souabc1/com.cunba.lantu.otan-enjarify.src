package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;

public final class FragmentReuseViolation
  extends Violation
{
  public final String o00Ooo00;
  
  public FragmentReuseViolation(Fragment paramFragment, String paramString)
  {
    super(paramFragment, (String)localObject);
    this.o00Ooo00 = paramString;
  }
  
  public final String getPreviousFragmentId()
  {
    return this.o00Ooo00;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.strictmode.FragmentReuseViolation
 * JD-Core Version:    0.7.0.1
 */