Feature: Prueba automatiazacion
  Yo como automatizador
  Necesito crear una nota de texto enriquecido con letra en negrita
  Para una prueba de automatizacion

  @PruebaDevco
  Scenario: Crear una nota de texto enriquecido con letra en negrita
    Given nececisto ingresar a la plataforma de notepadOnline
    When creo una nota de texto enriquecida "HHola Mundo" en letra en negrita
    Then valido el ingreso del texto "Hola Mundo"

