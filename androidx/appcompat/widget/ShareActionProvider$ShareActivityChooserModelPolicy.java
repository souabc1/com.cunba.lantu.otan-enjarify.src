package androidx.appcompat.widget;

import android.content.Intent;

class ShareActionProvider$ShareActivityChooserModelPolicy
  implements ActivityChooserModel.OnChooseActivityListener
{
  public ShareActionProvider$ShareActivityChooserModelPolicy(ShareActionProvider paramShareActionProvider) {}
  
  public boolean OooO00o(ActivityChooserModel paramActivityChooserModel, Intent paramIntent)
  {
    paramActivityChooserModel = this.OooO00o;
    ShareActionProvider.OnShareTargetSelectedListener localOnShareTargetSelectedListener = paramActivityChooserModel.OooO0oo;
    if (localOnShareTargetSelectedListener != null) {
      localOnShareTargetSelectedListener.OooO00o(paramActivityChooserModel, paramIntent);
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ShareActionProvider.ShareActivityChooserModelPolicy
 * JD-Core Version:    0.7.0.1
 */