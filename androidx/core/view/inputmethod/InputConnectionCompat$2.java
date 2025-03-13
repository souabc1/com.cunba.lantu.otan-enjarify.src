package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.inputmethod.InputConnectionWrapper;

class InputConnectionCompat$2
  extends InputConnectionWrapper
{
  public boolean performPrivateCommand(String paramString, Bundle paramBundle)
  {
    InputConnectionCompat.OnCommitContentListener localOnCommitContentListener = this.OooO00o;
    boolean bool = InputConnectionCompat.OooO0o0(paramString, paramBundle, localOnCommitContentListener);
    if (bool) {
      return true;
    }
    return super.performPrivateCommand(paramString, paramBundle);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.inputmethod.InputConnectionCompat.2
 * JD-Core Version:    0.7.0.1
 */