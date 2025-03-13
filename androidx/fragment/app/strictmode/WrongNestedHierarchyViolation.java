package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;

public final class WrongNestedHierarchyViolation
  extends Violation
{
  public final int o00Ooo0;
  public final Fragment o00Ooo00;
  
  public WrongNestedHierarchyViolation(Fragment paramFragment1, Fragment paramFragment2, int paramInt)
  {
    super(paramFragment1, (String)localObject);
    this.o00Ooo00 = paramFragment2;
    this.o00Ooo0 = paramInt;
  }
  
  public final int getContainerId()
  {
    return this.o00Ooo0;
  }
  
  public final Fragment getExpectedParentFragment()
  {
    return this.o00Ooo00;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.strictmode.WrongNestedHierarchyViolation
 * JD-Core Version:    0.7.0.1
 */