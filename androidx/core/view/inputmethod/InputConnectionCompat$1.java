package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

class InputConnectionCompat$1
  extends InputConnectionWrapper
{
  public InputConnectionCompat$1(InputConnection paramInputConnection, boolean paramBoolean, InputConnectionCompat.OnCommitContentListener paramOnCommitContentListener)
  {
    super(paramInputConnection, paramBoolean);
  }
  
  public boolean commitContent(InputContentInfo paramInputContentInfo, int paramInt, Bundle paramBundle)
  {
    InputConnectionCompat.OnCommitContentListener localOnCommitContentListener = this.OooO00o;
    InputContentInfoCompat localInputContentInfoCompat = InputContentInfoCompat.OooO0OO(paramInputContentInfo);
    boolean bool = localOnCommitContentListener.OooO00o(localInputContentInfoCompat, paramInt, paramBundle);
    if (bool) {
      return true;
    }
    return super.commitContent(paramInputContentInfo, paramInt, paramBundle);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.inputmethod.InputConnectionCompat.1
 * JD-Core Version:    0.7.0.1
 */