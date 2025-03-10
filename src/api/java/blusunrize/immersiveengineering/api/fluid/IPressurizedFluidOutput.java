/*
 * BluSunrize
 * Copyright (c) 2023
 *
 * This code is licensed under "Blu's License of Common Sense"
 * Details can be found in the license file in the root folder of this project
 */

package blusunrize.immersiveengineering.api.fluid;

import net.minecraftforge.fluids.FluidStack;

public interface IPressurizedFluidOutput
{
	default int getMaxAcceptedFluidAmount(FluidStack resource)
	{
		return IFluidPipe.AMOUNT_PRESSURIZED;
	}
}
