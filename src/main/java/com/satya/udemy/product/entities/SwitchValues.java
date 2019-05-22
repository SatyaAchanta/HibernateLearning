package com.satya.udemy.product.entities;

public class SwitchValues {
	
	void switchFormAndModelValues(String jsonString) {
		
		String[] arrayValues = jsonString.split(",");
		
		for (int i = 0; i < arrayValues.length; i++) {
			
			String[] tempArray = arrayValues[i].split(":");
			String tempValue1 = tempArray[1] + " = ";
			
			String tempValue = tempArray[0].replaceAll("[-+.^:,]","").trim();
			
			String tempValue2 = "formData." + tempValue;
			
			arrayValues[i] = tempValue1 + tempValue2 + ";";
			
			System.out.println(arrayValues[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stud {
		
		SwitchValues stringSwitcher = new SwitchValues();
		
		String actualValue = "consignmentId: this.model.consignmentId,\r\n" + 
				"      consignmentType: this.model.consignmentType,\r\n" + 
				"      customerId: this.model.customerId,\r\n" + 
				"      customerName: this.model.customerName,\r\n" + 
				"      masterConsignmentId: this.model.masterConsignmentId,\r\n" + 
				"      shipmentDate: this.shipmentDateTimeString,\r\n" + 
				"      deliveryDateTime: this.deliveryDateTimeString,\r\n" + 
				"      status: this.model.failedStatus,\r\n" + 
				"      failedStatus: this.model.poolPoint,\r\n" + 
				"      poolPoint: this.model.consignmentMode,\r\n" + 
				"      consignmentMode: this.model.consignmentMode,\r\n" + 
				"      packagingStatus: this.model.packagingStatus,\r\n" + 
				"      accountingEntity: this.model.accountingEntityId,\r\n" + 
				"      shipToShipToId: this.model.shipToShipToId,\r\n" + 
				"      shipToShipToName: this.model.shipToShipToName,\r\n" + 
				"      shipToShipToAddressAttentionOfName: this.model.shipToShipToAddressAttentionOfName,\r\n" + 
				"      shipToShipToAddressUnit: this.model.shipToShipToAddressUnit,\r\n" + 
				"      shipToShipToAddressFloor: this.model.shipToShipToAddressFloor,\r\n" + 
				"      shipToShipToAddressBuildingNumber: this.model.shipToShipToAddressBuildingNumber,\r\n" + 
				"      shipToShipToAddressBuildingName: this.model.shipToShipToAddressBuildingName,\r\n" + 
				"      shipToShipToAddressPostOfficeBox: this.model.shipToShipToAddressPostOfficeBox,\r\n" + 
				"      shipToShipToAddressStreetName: this.model.shipToShipToAddressStreetName,\r\n" + 
				"      shipToShipToAddressPostalCode: this.model.shipToShipToAddressPostalCode,\r\n" + 
				"      shipToShipToAddressCityName: this.model.shipToShipToAddressCityName,\r\n" + 
				"      shipToShipToAddressCountryCode: this.model.shipToShipToAddressCountryCode,\r\n" + 
				"      shipToShipToAddressCountrySubDivisionCode: this.model.shipToShipToAddressCountrySubDivisionCode,\r\n" + 
				"      shipToShipToAddressLine1: this.model.shipToShipToAddressLine1,\r\n" + 
				"      shipToShipToAddressLine2: this.model.shipToShipToAddressLine2,\r\n" + 
				"      shipToShipToAddressLine3: this.model.shipToShipToAddressLine3,\r\n" + 
				"      shipToShipToAddressLine4: this.model.shipToShipToAddressLine4,\r\n" + 
				"      shipToShipToAddressLine5: this.model.shipToShipToAddressLine5,\r\n" + 
				"      shipToShipToAddressLine6: this.model.shipToShipToAddressLine6,\r\n" + 
				"      shipToTaxId: this.model.shipToTaxId,\r\n" + 
				"      shipToDunsId: this.model.shipToDunsId,\r\n" + 
				"      shipToEdiPlant: this.model.shipToEdiPlant,\r\n" + 
				"      shipToEdiShipTo: this.model.shipToEdiShipTo,\r\n" + 
				"      targetShipToShipToId: this.model.targetShipToShipToId,\r\n" + 
				"      targetShipToShipToName: this.model.targetShipToShipToName,\r\n" + 
				"      targetShipToShipToAddressAttentionOfName: this.model.targetShipToShipToAddressAttentionOfName,\r\n" + 
				"      targetShipToShipToAddressUnit: this.model.targetShipToShipToAddressUnit,\r\n" + 
				"      targetShipToShipToAddressFloor: this.model.targetShipToShipToAddressFloor,\r\n" + 
				"      targetShipToShipToAddressBuildingNumber: this.model.targetShipToShipToAddressBuildingNumber,\r\n" + 
				"      targetShipToShipToAddressBuildingName: this.model.targetShipToShipToAddressBuildingName,\r\n" + 
				"      targetShipToShipToAddressPostOfficeBox: this.model.targetShipToShipToAddressPostOfficeBox,\r\n" + 
				"      targetShipToShipToAddressStreetName: this.model.targetShipToShipToAddressStreetName,\r\n" + 
				"      targetShipToShipToAddressPostalCode: this.model.targetShipToShipToAddressPostalCode,\r\n" + 
				"      targetShipToShipToAddressCityName: this.model.targetShipToShipToAddressCityName,\r\n" + 
				"      targetShipToShipToAddressCountryCode: this.model.targetShipToShipToAddressCountryCode,\r\n" + 
				"      targetShipToShipToAddressCountrySubDivisionCode: this.model.targetShipToShipToAddressCountrySubDivisionCode,\r\n" + 
				"      targetShipToShipToAddressLine1: this.model.targetShipToShipToAddressLine1,\r\n" + 
				"      targetShipToShipToAddressLine2: this.model.targetShipToShipToAddressLine2,\r\n" + 
				"      targetShipToShipToAddressLine3: this.model.targetShipToShipToAddressLine3,\r\n" + 
				"      targetShipToShipToAddressLine4: this.model.targetShipToShipToAddressLine4,\r\n" + 
				"      targetShipToShipToAddressLine5: this.model.targetShipToShipToAddressLine5,\r\n" + 
				"      targetShipToShipToAddressLine6: this.model.targetShipToShipToAddressLine6,\r\n" + 
				"      targetShipToTaxId: this.model.targetShipToTaxId,\r\n" + 
				"      targetShipToDunsId: this.model.targetShipToDunsId,\r\n" + 
				"      customerCustomerId: this.model.customerCustomerId,\r\n" + 
				"      customerCustomerName: this.model.customerCustomerName,\r\n" + 
				"      customerCustomerAddressAttentionOfName: this.model.customerCustomerAddressAttentionOfName,\r\n" + 
				"      customerCustomerAddressUnit: this.model.customerCustomerAddressUnit,\r\n" + 
				"      customerCustomerAddressFloor: this.model.customerCustomerAddressFloor,\r\n" + 
				"      customerCustomerAddressBuildingNumber: this.model.customerCustomerAddressBuildingNumber,\r\n" + 
				"      customerCustomerAddressBuildingName: this.model.customerCustomerAddressBuildingName,\r\n" + 
				"      customerCustomerAddressPostOfficeBox: this.model.customerCustomerAddressPostOfficeBox,\r\n" + 
				"      customerCustomerAddressStreetName: this.model.customerCustomerAddressStreetName,\r\n" + 
				"      customerCustomerAddressPostalCode: this.model.customerCustomerAddressPostalCode,\r\n" + 
				"      customerCustomerAddressCityName: this.model.customerCustomerAddressCityName,\r\n" + 
				"      customerCustomerAddressCountryCode: this.model.customerCustomerAddressCountryCode,\r\n" + 
				"      customerCustomerAddressCountrySubDivisionCode: this.model.customerCustomerAddressCountrySubDivisionCode,\r\n" + 
				"      customerCustomerAddressLine1: this.model.customerCustomerAddressLine1,\r\n" + 
				"      customerCustomerAddressLine2: this.model.customerCustomerAddressLine2,\r\n" + 
				"      customerCustomerAddressLine3: this.model.customerCustomerAddressLine3,\r\n" + 
				"      customerCustomerAddressLine4: this.model.customerCustomerAddressLine4,\r\n" + 
				"      customerCustomerAddressLine5: this.model.customerCustomerAddressLine5,\r\n" + 
				"      customerCustomerAddressLine6: this.model.customerCustomerAddressLine6,\r\n" + 
				"      customerTaxId: this.model.customerTaxId,\r\n" + 
				"      customerDunsId: this.model.customerDunsId,\r\n" + 
				"      customerPersonInCharge: this.model.customerPersonInCharge,\r\n" + 
				"      customerPhoneCustomer: this.model.customerPhoneCustomer,\r\n" + 
				"      customerFaxCustomer: this.model.customerFaxCustomer,\r\n" + 
				"      customerEmailsCustomer: this.model.customerFaxCustomer,\r\n" + 
				"      customerAsnCancellationSupported: this.model.customerAsnCancellationSupported,\r\n" + 
				"      shipFromShipFromId: this.model.shipFromShipFromId,\r\n" + 
				"      shipFromName: this.model.shipFromName,\r\n" + 
				"      shipFromAddressAttentionOfName: this.model.shipFromAddressAttentionOfName,\r\n" + 
				"      shipFromAddressUnit: this.model.shipFromAddressUnit,\r\n" + 
				"      shipFromAddressFloor: this.model.shipFromAddressFloor,\r\n" + 
				"      shipFromAddressBuildingNumber: this.model.shipFromAddressBuildingNumber,\r\n" + 
				"      shipFromAddressBuildingName: this.model.shipFromAddressBuildingName,\r\n" + 
				"      shipFromAddressPostOfficeBox: this.model.shipFromAddressPostOfficeBox,\r\n" + 
				"      shipFromAddressStreetName: this.model.shipFromAddressStreetName,\r\n" + 
				"      shipFromAddressPostalCode: this.model.shipFromAddressPostalCode,\r\n" + 
				"      shipFromAddressCityName: this.model.shipFromAddressCityName,\r\n" + 
				"      shipFromAddressCountryCode: this.model.shipFromAddressCountryCode,\r\n" + 
				"      shipFromAddressCountrySubDivisionCode: this.model.shipFromAddressCountrySubDivisionCode,\r\n" + 
				"      shipFromAddressLine1: this.model.shipFromAddressLine1,\r\n" + 
				"      shipFromAddressLine2: this.model.shipFromAddressLine2,\r\n" + 
				"      shipFromAddressLine3: this.model.shipFromAddressLine3,\r\n" + 
				"      shipFromAddressLine4: this.model.shipFromAddressLine4,\r\n" + 
				"      shipFromAddressLine5: this.model.shipFromAddressLine5,\r\n" + 
				"      shipFromAddressLine6: this.model.shipFromAddressLine6,\r\n" + 
				"      shipFromTaxId: this.model.shipFromTaxId,\r\n" + 
				"      shipFromDunsId: this.model.shipFromDunsId,\r\n" + 
				"      shipFromExternalSupplierNumber: this.model.shipFromExternalSupplierNumber,\r\n" + 
				"      shipFromPersonInCharge: this.model.shipFromPersonInCharge,\r\n" + 
				"      shipFromPhoneOwn: this.model.shipFromPhoneOwn,\r\n" + 
				"      shipFromFaxOwn: this.model.shipFromFaxOwn,\r\n" + 
				"      shipFromEmailsOwn: this.model.shipFromEmailsOwn,\r\n" + 
				"      shipFromAccountingEntity: this.model.shipFromAccountingEntity,\r\n" + 
				"      shipFromLocation: this.model.shipFromLocation";
		
		stringSwitcher.switchFormAndModelValues(actualValue);
	}

}
