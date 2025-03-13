package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;

public final class InputConnectionCompat
{
  public static InputConnectionCompat.OnCommitContentListener OooO0O0(View paramView)
  {
    Preconditions.OooO0oo(paramView);
    OooO00o localOooO00o = new androidx/core/view/inputmethod/OooO00o;
    localOooO00o.<init>(paramView);
    return localOooO00o;
  }
  
  public static InputConnection OooO0OO(View paramView, InputConnection paramInputConnection, EditorInfo paramEditorInfo)
  {
    paramView = OooO0O0(paramView);
    return OooO0Oo(paramInputConnection, paramEditorInfo, paramView);
  }
  
  public static InputConnection OooO0Oo(InputConnection paramInputConnection, EditorInfo paramEditorInfo, InputConnectionCompat.OnCommitContentListener paramOnCommitContentListener)
  {
    ObjectsCompat.OooO0Oo(paramInputConnection, "inputConnection must be non-null");
    ObjectsCompat.OooO0Oo(paramEditorInfo, "editorInfo must be non-null");
    ObjectsCompat.OooO0Oo(paramOnCommitContentListener, "onCommitContentListener must be non-null");
    paramEditorInfo = new androidx/core/view/inputmethod/InputConnectionCompat$1;
    paramEditorInfo.<init>(paramInputConnection, false, paramOnCommitContentListener);
    return paramEditorInfo;
  }
  
  public static boolean OooO0o0(String paramString, Bundle paramBundle, InputConnectionCompat.OnCommitContentListener paramOnCommitContentListener)
  {
    int i = 0;
    if (paramBundle == null) {
      return false;
    }
    String str1 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    boolean bool1 = TextUtils.equals(str1, paramString);
    boolean bool2;
    if (bool1)
    {
      bool2 = false;
      paramString = null;
    }
    else
    {
      str1 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
      bool2 = TextUtils.equals(str1, paramString);
      if (!bool2) {
        break label303;
      }
      bool2 = true;
    }
    bool1 = false;
    str1 = null;
    Object localObject1;
    if (bool2) {
      localObject1 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    } else {
      localObject1 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    }
    try
    {
      localObject1 = paramBundle.getParcelable((String)localObject1);
      localObject1 = (ResultReceiver)localObject1;
      Object localObject2;
      if (bool2) {
        localObject2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
      } else {
        localObject2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
      }
      try
      {
        localObject2 = paramBundle.getParcelable((String)localObject2);
        localObject2 = (Uri)localObject2;
        if (bool2) {
          localObject3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
        } else {
          localObject3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
        }
        Object localObject3 = paramBundle.getParcelable((String)localObject3);
        localObject3 = (ClipDescription)localObject3;
        if (bool2) {
          localObject4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
        } else {
          localObject4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
        }
        Object localObject4 = paramBundle.getParcelable((String)localObject4);
        localObject4 = (Uri)localObject4;
        String str2;
        if (bool2) {
          str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
        } else {
          str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
        }
        int j = paramBundle.getInt(str2);
        if (bool2) {
          paramString = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
        } else {
          paramString = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
        }
        paramString = paramBundle.getParcelable(paramString);
        paramString = (Bundle)paramString;
        if ((localObject2 != null) && (localObject3 != null))
        {
          paramBundle = new androidx/core/view/inputmethod/InputContentInfoCompat;
          paramBundle.<init>((Uri)localObject2, (ClipDescription)localObject3, (Uri)localObject4);
          i = paramOnCommitContentListener.OooO00o(paramBundle, j, paramString);
        }
        if (localObject1 != null) {
          ((ResultReceiver)localObject1).send(i, null);
        }
        return i;
      }
      finally {}
      if (localObject1 == null) {
        break label301;
      }
    }
    finally
    {
      localObject1 = null;
    }
    ((ResultReceiver)localObject1).send(0, null);
    label301:
    throw paramString;
    label303:
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.inputmethod.InputConnectionCompat
 * JD-Core Version:    0.7.0.1
 */