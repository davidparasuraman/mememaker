/*#######################################################
 *
 *   Maintained by Gregor Santner, 2016-
 *   https://gsantner.net/
 *
 *   License of this file: GNU GPLv3 (Commercial upon request)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
#########################################################*/
package com.david.mememaker.ui;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * Extended Image View com.david.mememaker.so the Image View is a square
 */
public class SquareImageView extends AppCompatImageView {

    public SquareImageView(Context context) {
        super(context);
    }

    public SquareImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    // override to set the height of the Image View to its width
    @Override
    @SuppressWarnings("SuspiciousNameCombination")
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);

        int width = getMeasuredWidth();
        int height = getMeasuredHeight();

        // Optimization com.david.mememaker.so we don't measure twice unless we need to
        if (width != height) {
            setMeasuredDimension(width, width);
        }
    }

}
