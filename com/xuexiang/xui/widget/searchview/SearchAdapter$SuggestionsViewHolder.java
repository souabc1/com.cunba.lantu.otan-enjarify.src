package com.xuexiang.xui.widget.searchview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.xuexiang.xui.R.id;

class SearchAdapter$SuggestionsViewHolder
{
  public TextView OooO00o;
  public ImageView OooO0O0;
  
  public SearchAdapter$SuggestionsViewHolder(SearchAdapter paramSearchAdapter, View paramView)
  {
    int i = R.id.suggestion_text;
    Object localObject = (TextView)paramView.findViewById(i);
    this.OooO00o = ((TextView)localObject);
    localObject = SearchAdapter.OooO0O0(paramSearchAdapter);
    if (localObject != null)
    {
      i = R.id.suggestion_icon;
      paramView = (ImageView)paramView.findViewById(i);
      this.OooO0O0 = paramView;
      paramSearchAdapter = SearchAdapter.OooO0O0(paramSearchAdapter);
      paramView.setImageDrawable(paramSearchAdapter);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.searchview.SearchAdapter.SuggestionsViewHolder
 * JD-Core Version:    0.7.0.1
 */