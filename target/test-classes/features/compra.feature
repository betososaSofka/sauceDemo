Feature: Flujo de compra

  Scenario Outline: Compra exitosa de dos productos
    Given inicio sesión con el usuario "<usuario>" y la contraseña "<pass>"
    When agrego dos productos al carrito
    And visualizo el carrito
    And completo el formulario de compra con nombre "<nombre>", apellido "<apellido>" y dirección "<direccion>"
    Then debería ver el mensaje de confirmación "Thank you for your order!"

Examples:
    |   usuario      | pass       | nombre          | apellido     | direccion   |
    |   standard_user|secret_sauce| Beto            | Sosa         | avenida 123 |
    |   standard_user|secret_sauce| Dani            | Alvarado     | avenida 456 |
    
