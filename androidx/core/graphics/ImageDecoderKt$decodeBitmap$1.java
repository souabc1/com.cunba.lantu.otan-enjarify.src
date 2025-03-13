package androidx.core.graphics;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder.ImageInfo;
import android.graphics.ImageDecoder.OnHeaderDecodedListener;
import android.graphics.ImageDecoder.Source;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

public final class ImageDecoderKt$decodeBitmap$1
  implements ImageDecoder.OnHeaderDecodedListener
{
  public final void onHeaderDecoded(ImageDecoder paramImageDecoder, ImageDecoder.ImageInfo paramImageInfo, ImageDecoder.Source paramSource)
  {
    Intrinsics.OooO0o(paramImageDecoder, "decoder");
    Intrinsics.OooO0o(paramImageInfo, "info");
    Intrinsics.OooO0o(paramSource, "source");
    this.OooO00o.OooO0OO(paramImageDecoder, paramImageInfo, paramSource);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.ImageDecoderKt.decodeBitmap.1
 * JD-Core Version:    0.7.0.1
 */