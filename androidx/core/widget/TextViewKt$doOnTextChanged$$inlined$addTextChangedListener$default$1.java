package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.functions.Function4;

public final class TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
  implements TextWatcher
{
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    Function4 localFunction4 = this.o00OoOoo;
    Integer localInteger1 = Integer.valueOf(paramInt1);
    Integer localInteger2 = Integer.valueOf(paramInt2);
    Integer localInteger3 = Integer.valueOf(paramInt3);
    localFunction4.OooO0oO(paramCharSequence, localInteger1, localInteger2, localInteger3);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.TextViewKt.doOnTextChanged..inlined.addTextChangedListener.default.1
 * JD-Core Version:    0.7.0.1
 */