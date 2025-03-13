package androidx.navigation.ui;

import androidx.customview.widget.Openable;
import java.util.HashSet;
import java.util.Set;

public final class AppBarConfiguration$Builder
{
  public final Set OooO00o;
  public Openable OooO0O0;
  public AppBarConfiguration.OnNavigateUpListener OooO0OO;
  
  public AppBarConfiguration$Builder(int... paramVarArgs)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.OooO00o = localHashSet;
    int i = paramVarArgs.length;
    int j = 0;
    while (j < i)
    {
      int k = paramVarArgs[j];
      Set localSet = this.OooO00o;
      Integer localInteger = Integer.valueOf(k);
      localSet.add(localInteger);
      j += 1;
    }
  }
  
  public final AppBarConfiguration OooO00o()
  {
    AppBarConfiguration localAppBarConfiguration = new androidx/navigation/ui/AppBarConfiguration;
    Set localSet = this.OooO00o;
    Openable localOpenable = this.OooO0O0;
    AppBarConfiguration.OnNavigateUpListener localOnNavigateUpListener = this.OooO0OO;
    localAppBarConfiguration.<init>(localSet, localOpenable, localOnNavigateUpListener, null);
    return localAppBarConfiguration;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.ui.AppBarConfiguration.Builder
 * JD-Core Version:    0.7.0.1
 */