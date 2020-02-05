package com.sgm.entornos.unittest;

import java.math.BigDecimal;

public class EnviromentCalculator implements Calculator{


	@Override
	public BigDecimal sum(BigDecimal firstSummand, BigDecimal secondSummand) {
		return firstSummand.add(secondSummand);
	}

	@Override
	public BigDecimal substract(BigDecimal minuend, BigDecimal subtrahend) {
		return minuend.subtract(subtrahend);
	}

	@Override
	public BigDecimal multiply(BigDecimal multiplicand, BigDecimal multiplier) {
		return multiplicand.multiply(multiplier);
	}

	@Override
	public BigDecimal divide(BigDecimal dividend, BigDecimal divisor) {
		try {
			return dividend.divide(divisor);
		}catch (Exception e) {
			return new BigDecimal(0);
		}
		
	}

	@Override
	public BigDecimal mcd(BigDecimal first, BigDecimal second) {
		
		BigDecimal maxNum = first.max(second);
		BigDecimal minNum = second.min(first);
		BigDecimal mcd;

		 do
         {            
             mcd = minNum;
             minNum = maxNum.remainder(minNum);
             maxNum = mcd;
         } while (minNum.compareTo(BigDecimal.ZERO) != 0);
         
         return mcd;
	}

	@Override
	public BigDecimal mcm(BigDecimal first, BigDecimal second) {
		
		BigDecimal mcm;
		
		BigDecimal maxNum = first.max(second);
		BigDecimal minNum = first.min(second);
		mcm = (maxNum.divide(this.mcd(first, second))).multiply(minNum);
		
		return mcm;
	}

	

}
