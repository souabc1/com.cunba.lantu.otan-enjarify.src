package com.xuexiang.xui.widget.progress.loading;

public abstract interface IMessageLoader
{
  public abstract boolean isLoading();
  
  public abstract void setCancelable(boolean paramBoolean);
  
  public abstract void setLoadingCancelListener(LoadingCancelListener paramLoadingCancelListener);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.progress.loading.IMessageLoader
 * JD-Core Version:    0.7.0.1
 */