package org.apache.poi.xwpf.converter.styles.pargraph;

import java.math.BigInteger;

import org.apache.poi.xwpf.converter.internal.DxaUtil;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSpacing;

public class PargraphSpacingBeforeValueProvider
    extends AbstractSpacingParagraphValueProvider<Integer>
{

    public static PargraphSpacingBeforeValueProvider INSTANCE = new PargraphSpacingBeforeValueProvider();

    @Override
    protected Integer getValue( CTSpacing spacing )
    {
        BigInteger before = spacing.getBefore();
        if ( before != null )
        {
            return DxaUtil.dxa2points( before );
        }
        return null;
    }
}