/*
 * Copyright (C) 2017 - 2019 | Wurst-Imperium | All rights reserved.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.forge.compatibility;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;

public final class WEnchantments
{
	public static boolean hasVanishingCurse(ItemStack stack)
	{
		return EnchantmentHelper.hasVanishingCurse(stack);
	}
}
