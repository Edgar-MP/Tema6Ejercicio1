package beans;

public class AlmacenPalabras {

  private static String palabras[] = new String[] {
    "que",
    "de",
    "no",
    "a",
    "la",
    "el",
    "es",
    "y",
    "en",
    "lo",
    "un",
    "por",
    "me",
    "una",
    "te",
    "los",
    "se",
    "con",
    "para",
    "mi",
    "si",
    "bien",
    "pero",
    "yo",
    "eso",
    "las",
    "su",
    "tu",
    "del",
    "al",
    "como",
    "le",
    "esto",
    "ya",
    "todo",
    "esta",
    "vamos",
    "muy",
    "hay",
    "ahora",
    "algo",
    "estoy",
    "tengo",
    "nos",
    "nada",
    "cuando",
    "ha",
    "este",
    "puedo",
    "quiero",
    "soy",
    "tiene",
    "gracias",
    "bueno",
    "fue",
    "ser",
    "hacer",
    "son",
    "todos",
    "monedas",
    "mirad",
    "miraba",
    "jesus",
    "griegos",
    "famosa",
    "corredor",
    "atravesar",
    "aguas",
    "modales",
    "guerras",
    "eternidad",
    "conocerla",
    "charlotte",
    "busquen",
    "buck",
    "acuerda",
    "sentirme",
    "ralph",
    "quema",
    "poema",
    "espiritual",
    "costumbre",
    "cabra",
    "alquiler",
    "williams",
    "vencido",
    "vela",
    "sospechosos",
    "quinto",
    "pilotos",
    "philip",
    "perdieron",
    "norman",
    "estructura",
    "complejo",
    "voces",
    "virginia",
    "tragos",
    "temor",
    "recursos",
    "oficialmente",
    "maquillaje",
    "guardaespaldas",
    "escucharme",
    "dejara",
    "contiene",
    "vuestros",
    "semejante",
    "pague",
    "molestes",
    "cultura",
    "antecedentes",
    "representante",
    "prestado",
    "oir",
    "nubes",
    "meterte",
    "guantes",
    "esperabas",
    "encontrarme",
    "consejos",
    "regreses",
    "preocupen",
    "pistolas",
    "jennifer",
    "gane",
    "dana",
    "sos",
    "niveles",
    "lane",
    "ganaste",
    "considerando",
    "capital",
    "cambie",
    "utilizar",
    "lograrlo",
    "gafas",
    "do",
    "watson",
    "ruby",
    "preguntaste",
    "ho",
    "estacionamiento",
    "contactos",
    "aguja",
    "turner",
    "trenes",
    "soporto",
    "oido",
    "fortaleza",
    "donald",
    "corea",
    "conversar",
    "computadoras",
    "volante",
    "jessica",
    "data",
    "cuente",
    "cabrones",
    "arruinar",
    "vampiro",
    "pases",
    "mitch",
    "megan",
    "logan",
    "facil",
    "estabamos",
    "diera",
    "detenga",
    "pam",
    "hemorragia",
    "fianza",
    "docena",
    "centavo",
    "carreras",
    "callado",
    "rodilla",
    "prometes",
    "profundamente",
    "posiciones",
    "hicieras",
    "furioso",
    "comes",
    "ciega",
    "cicatriz",
    "bebidas",
    "policial",
    "pasear",
    "masa",
    "llegues",
    "global",
    "escapado",
    "dinos",
    "cuarta",
    "bienes",
    "aparato",
    "steven",
    "realizar",
    "orgullosos",
    "corten",
    "vidrio",
    "presa",
    "ocupados",
    "morfina",
    "columna",
    "sacaron",
    "patas",
    "ocultar",
    "myers",
    "maneja",
    "largas",
    "generalmente",
    "fuentes",
    "cubrir",
    "ataca",
    "tenis",
    "santos",
    "potencial",
    "plano",
    "murphy",
    "levante",
    "escala",
    "enfrentar",
    "sobra",
    "rumor",
    "entras",
    "chinos",
    "brujas",
    "barbara",
    "admiro",
    "voto",
    "volvieron",
    "suelte",
    "reto",
    "metes",
    "infarto",
    "cuyo",
    "boleto",
    "besar",
    "portal",
    "ponemos",
    "monte",
    "digno",
    "desean",
    "darse",
    "considerar",
    "bancos",
    "pensabas",
    "generoso",
    "estatua",
    "convencer",
    "conocida",
    "comenzamos",
    "aceptado",
    "woody",
    "rob",
    "paige",
    "importar",
    "gabrielle",
    "fracaso",
    "ciertos",
    "bomberos",
    "sorprendido",
    "protegido",
    "presenta",
    "entenderlo",
    "detengan",
    "conflicto",
    "seco",
    "sabiendo",
    "hacerla",
    "green",
    "graves",
    "convencido",
    "comprende",
    "bromas",
    "yeah",
    "oyen",
    "moleste",
    "mencionar",
    "gastos",
    "esperaremos",
    "billetes",
    "arco",
    "altos",
    "actores",
    "talvez",
    "sitios",
    "saluda",
    "quejas",
    "planeando",
    "moriremos",
    "marica",
    "castle",
    "amantes",
    "acostumbrado",
    "tyler",
    "torneo",
    "planos",
    "ordeno",
    "morris",
    "maldicion",
    "kg",
    "confirmado",
    "vacas",
    "ponerlo",
    "origen",
    "verdaderos",
    "pasaje",
    "necesidades",
  };

  public String palabraRandom() {
    int cantidad = palabras.length;
    int n = (int) (Math.random() * cantidad);
    return palabras[n];
  }
}
