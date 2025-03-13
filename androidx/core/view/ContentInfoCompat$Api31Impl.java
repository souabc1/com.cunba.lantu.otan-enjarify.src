package androidx.core.view;

import android.content.ClipData;
import android.util.Pair;
import android.view.ContentInfo;
import android.view.ContentInfo.Builder;
import java.util.Objects;

final class ContentInfoCompat$Api31Impl
{
  public static Pair OooO00o(ContentInfo paramContentInfo, java.util.function.Predicate paramPredicate)
  {
    Object localObject1 = paramContentInfo.getClip();
    int i = ((ClipData)localObject1).getItemCount();
    int j = 1;
    if (i == j)
    {
      i = 0;
      localObject2 = null;
      localObject1 = ((ClipData)localObject1).getItemAt(0);
      boolean bool = paramPredicate.test(localObject1);
      if (bool) {
        localObject1 = paramContentInfo;
      } else {
        localObject1 = null;
      }
      if (bool) {
        paramContentInfo = null;
      }
      return Pair.create(localObject1, paramContentInfo);
    }
    Objects.requireNonNull(paramPredicate);
    Object localObject2 = new androidx/core/view/OooO0O0;
    ((OooO0O0)localObject2).<init>(paramPredicate);
    paramPredicate = ContentInfoCompat.OooO0OO((ClipData)localObject1, (androidx.core.util.Predicate)localObject2);
    localObject1 = paramPredicate.first;
    if (localObject1 == null) {
      return Pair.create(null, paramContentInfo);
    }
    localObject1 = paramPredicate.second;
    if (localObject1 == null) {
      return Pair.create(paramContentInfo, null);
    }
    localObject1 = new android/view/ContentInfo$Builder;
    ((ContentInfo.Builder)localObject1).<init>(paramContentInfo);
    localObject2 = (ClipData)paramPredicate.first;
    localObject1 = ((ContentInfo.Builder)localObject1).setClip((ClipData)localObject2).build();
    localObject2 = new android/view/ContentInfo$Builder;
    ((ContentInfo.Builder)localObject2).<init>(paramContentInfo);
    paramContentInfo = (ClipData)paramPredicate.second;
    paramContentInfo = ((ContentInfo.Builder)localObject2).setClip(paramContentInfo).build();
    return Pair.create(localObject1, paramContentInfo);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ContentInfoCompat.Api31Impl
 * JD-Core Version:    0.7.0.1
 */