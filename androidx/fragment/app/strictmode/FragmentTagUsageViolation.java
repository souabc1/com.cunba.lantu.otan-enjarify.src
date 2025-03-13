package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public final class FragmentTagUsageViolation
  extends Violation
{
  public final ViewGroup o00Ooo00;
  
  public FragmentTagUsageViolation(Fragment paramFragment, ViewGroup paramViewGroup)
  {
    super(paramFragment, (String)localObject);
    this.o00Ooo00 = paramViewGroup;
  }
  
  public final ViewGroup getParentContainer()
  {
    return this.o00Ooo00;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.strictmode.FragmentTagUsageViolation
 * JD-Core Version:    0.7.0.1
 */