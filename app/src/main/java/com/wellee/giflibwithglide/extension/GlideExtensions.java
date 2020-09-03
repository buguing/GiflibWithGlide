package com.wellee.giflibwithglide.extension;

import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.annotation.GlideExtension;
import com.bumptech.glide.annotation.GlideType;
import com.bumptech.glide.request.RequestOptions;
import com.wellee.gifdecoder.FrameSequenceDrawable;

@GlideExtension
public class GlideExtensions {

    private GlideExtensions() {

    }

    final static RequestOptions DECODE_TYPE = RequestOptions
            .decodeTypeOf(FrameSequenceDrawable.class)
            .lock();

    @GlideType(FrameSequenceDrawable.class)
    public static RequestBuilder<FrameSequenceDrawable> asGif2(RequestBuilder<FrameSequenceDrawable> requestBuilder) {
        return requestBuilder.apply(DECODE_TYPE);
    }

}
