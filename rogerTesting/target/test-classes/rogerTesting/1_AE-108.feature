Feature: cucumber testing automation-Replication PreCheck

	#cucumber testing automation
	@TEST_AE-108
	Scenario: cucumber testing automation-Replication PreCheck
		Given workspace is prepped 
		When Master and Slave are on same number
		Then replication is complete
		
