package com.hjq.toast.config;

import android.view.View;
import android.widget.TextView;
import m54207b69;

public abstract interface IToast
{
  public TextView OooO00o(View paramView)
  {
    boolean bool1 = paramView instanceof TextView;
    int j = 16908299;
    if (bool1)
    {
      int i = paramView.getId();
      int k = -1;
      if (i == k)
      {
        paramView.setId(j);
      }
      else
      {
        i = paramView.getId();
        if (i != j) {
          break label49;
        }
      }
      return (TextView)paramView;
      label49:
      paramView = new java/lang/IllegalArgumentException;
      str = m54207b69.F54207b69_11("2(71485F0B496261631064576714694E5C18727E1B725E5A746521616924996B6F7C9F6370832D826E3072707786746F7B36AB3874803B7B849394838A89");
      paramView.<init>(str);
      throw paramView;
    }
    paramView = paramView.findViewById(j);
    boolean bool2 = paramView instanceof TextView;
    if (bool2) {
      return (TextView)paramView;
    }
    paramView = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11(",F1F2A35692F383B396E383230364030327638782537534827473C4B814D4C504D86484A8933278C574F535D4E92564E955B5467685B56599DA6776565A262676163BDA86A6C677A70776BC67A6EC8B255777974877D8478D3877BC3867F9293868184C6CDCA918D978FCF8F948E90EAD5A0A095A4DCAA99A9879BE8A2A49FB2A8AFA3EA97ECB4A8EFB3ACBFC0B3AEB1FEFF");
    paramView.<init>(str);
    throw paramView;
  }
  
  public abstract void cancel();
  
  public abstract int getDuration();
  
  public abstract int getGravity();
  
  public abstract float getHorizontalMargin();
  
  public abstract float getVerticalMargin();
  
  public abstract View getView();
  
  public abstract int getXOffset();
  
  public abstract int getYOffset();
  
  public abstract void setDuration(int paramInt);
  
  public abstract void setGravity(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void setMargin(float paramFloat1, float paramFloat2);
  
  public abstract void setText(int paramInt);
  
  public abstract void setText(CharSequence paramCharSequence);
  
  public abstract void setView(View paramView);
  
  public abstract void show();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.toast.config.IToast
 * JD-Core Version:    0.7.0.1
 */