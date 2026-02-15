Feature: Download OPEC+ report from Capital Inteligente

  Scenario: Download and validate OPEC+ July 2021 report
    Given the actor opens the Bancolombia portal in the Personas section
    When the actor selects the "Corporativos" menu
    And selects the "Capital Inteligente" option
    And navigates to the "Actualidad Económica" section
    And configures the view to display the available reports
    And selects the report "OPEP+ aumentará la oferta de petróleo en julio de 2021"
    And clicks on the "Descargue aquí el informe en PDF del sector petróleo de mayo de 2021."
    Then the system should generate the download of a PDF file

