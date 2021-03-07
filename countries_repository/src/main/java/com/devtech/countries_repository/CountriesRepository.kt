package com.devtech.countries_repository

import java.util.*
import kotlin.collections.ArrayList

object CountriesRepository {

    private val arrayList: ArrayList<Country> = ArrayList<Country>()

    init {
        setArrayListWithID()
    }

    fun getAllCountries() = arrayList

    fun getCountryList(query: String): List<Country> = arrayList.filter { country ->
        country.name.toLowerCase(Locale.ROOT).contains(query.toLowerCase(Locale.ROOT))
                || country.numericCode.toString() == query
    }

    private fun setArrayListWithID() {
        arrayList.add(Country("Afghanistan", "AF", 93, R.drawable.flag_004))
        arrayList.add(Country("Åland Islands", "AX", 358, R.drawable.flag_248))
        arrayList.add(Country("Albania", "AL", 355, R.drawable.flag_008))
        arrayList.add(Country("Algeria", "DZ", 213, R.drawable.flag_012))
        arrayList.add(Country("American Samoa", "AS", 1684, R.drawable.flag_016))
        arrayList.add(Country("Andorra", "AD", 376, R.drawable.flag_020))
        arrayList.add(Country("Angola", "AO", 244, R.drawable.flag_024))
        arrayList.add(Country("Anguilla", "AI", 1264, R.drawable.flag_660))
        arrayList.add(Country("Antarctica", "AQ", 672, R.drawable.flag_010))
        arrayList.add(Country("Antigua and Barbuda", "AG", 1268, R.drawable.flag_028))
        arrayList.add(Country("Argentina", "AR", 54, R.drawable.flag_032))
        arrayList.add(Country("Armenia", "AM", 374, R.drawable.flag_051))
        arrayList.add(Country("Aruba", "AW", 297, R.drawable.flag_533))
        arrayList.add(Country("Australia", "AU", 61, R.drawable.flag_036))
        arrayList.add(Country("Austria", "AT", 43, R.drawable.flag_040))
        arrayList.add(Country("Azerbaijan", "AZ", 994, R.drawable.flag_031))
        arrayList.add(Country("Bahamas", "BS", 1242, R.drawable.flag_044))
        arrayList.add(Country("Bahrain", "BH", 973, R.drawable.flag_048))
        arrayList.add(Country("Bangladesh", "BD", 880, R.drawable.flag_050))
        arrayList.add(Country("Barbados", "BB", 1246, R.drawable.flag_052))
        arrayList.add(Country("Belarus", "BY", 375, R.drawable.flag_112))
        arrayList.add(Country("Belgium", "BE", 32, R.drawable.flag_056))
        arrayList.add(Country("Belize", "BZ", 501, R.drawable.flag_084))
        arrayList.add(Country("Benin", "BJ", 229, R.drawable.flag_204))
        arrayList.add(Country("Bermuda", "BM", 1441, R.drawable.flag_060))
        arrayList.add(Country("Bhutan", "BT", 975, R.drawable.flag_064))
        arrayList.add(Country("Bolivia (Plurinational State of)", "BO", 591, R.drawable.flag_068))
        arrayList.add(
            Country(
                "Bonaire, Sint Eustatius and Saba",
                "BQ",
                5997,
                R.drawable.flag_535
            )
        )
        arrayList.add(Country("Bosnia and Herzegovina", "BA", 387, R.drawable.flag_070))
        arrayList.add(Country("Botswana", "BW", 267, R.drawable.flag_072))
        arrayList.add(Country("Bouvet Island", "BV", 47, R.drawable.flag_074))
        arrayList.add(Country("Brazil", "BR", 55, R.drawable.flag_076))
        arrayList.add(Country("British Indian Ocean Territory", "IO", 246, R.drawable.flag_086))
        arrayList.add(Country("Virgin Islands (British)", "VG", 1284, R.drawable.flag_092))
        arrayList.add(Country("Virgin Islands (U.S.)", "VI", 1340, R.drawable.flag_850))
        arrayList.add(Country("Brunei Darussalam", "BN", 673, R.drawable.flag_096))
        arrayList.add(Country("Bulgaria", "BG", 359, R.drawable.flag_100))
        arrayList.add(Country("Burkina Faso", "BF", 226, R.drawable.flag_854))
        arrayList.add(Country("Burundi", "BI", 257, R.drawable.flag_108))
        arrayList.add(Country("Cambodia", "KH", 855, R.drawable.flag_116))
        arrayList.add(Country("Cameroon", "CM", 237, R.drawable.flag_120))
        arrayList.add(Country("Canada", "CA", 1, R.drawable.flag_124))
        arrayList.add(Country("Cabo Verde", "CV", 238, R.drawable.flag_132))
        arrayList.add(Country("Cayman Islands", "KY", 1345, R.drawable.flag_136))
        arrayList.add(Country("Central African Republic", "CF", 236, R.drawable.flag_140))
        arrayList.add(Country("Chad", "TD", 235, R.drawable.flag_148))
        arrayList.add(Country("Chile", "CL", 56, R.drawable.flag_152))
        arrayList.add(Country("China", "CN", 86, R.drawable.flag_156))
        arrayList.add(Country("Christmas Island", "CX", 61, R.drawable.flag_162))
        arrayList.add(Country("Cocos (Keeling) Islands", "CC", 61, R.drawable.flag_166))
        arrayList.add(Country("Colombia", "CO", 57, R.drawable.flag_170))
        arrayList.add(Country("Comoros", "KM", 269, R.drawable.flag_174))
        arrayList.add(Country("Congo", "CG", 242, R.drawable.flag_178))
        arrayList.add(
            Country(
                "Congo (Democratic Republic of the)",
                "CD",
                243,
                R.drawable.flag_180
            )
        )
        arrayList.add(Country("Cook Islands", "CK", 682, R.drawable.flag_184))
        arrayList.add(Country("Costa Rica", "CR", 506, R.drawable.flag_188))
        arrayList.add(Country("Croatia", "HR", 385, R.drawable.flag_191))
        arrayList.add(Country("Cuba", "CU", 53, R.drawable.flag_192))
        arrayList.add(Country("Curaçao", "CW", 599, R.drawable.flag_531))
        arrayList.add(Country("Cyprus", "CY", 357, R.drawable.flag_196))
        arrayList.add(Country("Czech Republic", "CZ", 420, R.drawable.flag_203))
        arrayList.add(Country("Denmark", "DK", 45, R.drawable.flag_208))
        arrayList.add(Country("Djibouti", "DJ", 253, R.drawable.flag_262))
        arrayList.add(Country("Dominica", "DM", 1767, R.drawable.flag_212))
        arrayList.add(Country("Dominican Republic", "DO", 1809, R.drawable.flag_214))
        arrayList.add(Country("Ecuador", "EC", 593, R.drawable.flag_218))
        arrayList.add(Country("Egypt", "EG", 20, R.drawable.flag_818))
        arrayList.add(Country("El Salvador", "SV", 503, R.drawable.flag_222))
        arrayList.add(Country("Equatorial Guinea", "GQ", 240, R.drawable.flag_226))
        arrayList.add(Country("Eritrea", "ER", 291, R.drawable.flag_232))
        arrayList.add(Country("Estonia", "EE", 372, R.drawable.flag_233))
        arrayList.add(Country("Ethiopia", "ET", 251, R.drawable.flag_231))
        arrayList.add(Country("Falkland Islands (Malvinas)", "FK", 500, R.drawable.flag_238))
        arrayList.add(Country("Faroe Islands", "FO", 298, R.drawable.flag_234))
        arrayList.add(Country("Fiji", "FJ", 679, R.drawable.flag_242))
        arrayList.add(Country("Finland", "FI", 358, R.drawable.flag_246))
        arrayList.add(Country("France", "FR", 33, R.drawable.flag_250))
        arrayList.add(Country("French Guiana", "GF", 594, R.drawable.flag_254))
        arrayList.add(Country("French Polynesia", "PF", 689, R.drawable.flag_258))
        arrayList.add(Country("Gabon", "GA", 241, R.drawable.flag_266))
        arrayList.add(Country("Gambia", "GM", 220, R.drawable.flag_270))
        arrayList.add(Country("Georgia", "GE", 995, R.drawable.flag_268))
        arrayList.add(Country("Germany", "DE", 49, R.drawable.flag_276))
        arrayList.add(Country("Ghana", "GH", 233, R.drawable.flag_288))
        arrayList.add(Country("Gibraltar", "GI", 350, R.drawable.flag_292))
        arrayList.add(Country("Greece", "GR", 30, R.drawable.flag_300))
        arrayList.add(Country("Greenland", "GL", 299, R.drawable.flag_304))
        arrayList.add(Country("Grenada", "GD", 1473, R.drawable.flag_308))
        arrayList.add(Country("Guadeloupe", "GP", 590, R.drawable.flag_312))
        arrayList.add(Country("Guam", "GU", 1671, R.drawable.flag_316))
        arrayList.add(Country("Guatemala", "GT", 502, R.drawable.flag_320))
        arrayList.add(Country("Guernsey", "GG", 44, R.drawable.flag_831))
        arrayList.add(Country("Guinea", "GN", 224, R.drawable.flag_324))
        arrayList.add(Country("Guinea-Bissau", "GW", 245, R.drawable.flag_624))
        arrayList.add(Country("Guyana", "GY", 592, R.drawable.flag_328))
        arrayList.add(Country("Haiti", "HT", 509, R.drawable.flag_332))
        arrayList.add(Country("Holy See", "VA", 379, R.drawable.flag_336))
        arrayList.add(Country("Honduras", "HN", 504, R.drawable.flag_340))
        arrayList.add(Country("Hong Kong", "HK", 852, R.drawable.flag_344))
        arrayList.add(Country("Hungary", "HU", 36, R.drawable.flag_348))
        arrayList.add(Country("Iceland", "IS", 354, R.drawable.flag_352))
        arrayList.add(Country("India", "IN", 91, R.drawable.flag_356))
        arrayList.add(Country("Indonesia", "ID", 62, R.drawable.flag_360))
        arrayList.add(Country("Côte d'Ivoire", "CI", 225, R.drawable.flag_384))
        arrayList.add(Country("Iran (Islamic Republic of)", "IR", 98, R.drawable.flag_364))
        arrayList.add(Country("Iraq", "IQ", 964, R.drawable.flag_368))
        arrayList.add(Country("Ireland", "IE", 353, R.drawable.flag_372))
        arrayList.add(Country("Isle of Man", "IM", 44, R.drawable.flag_833))
        arrayList.add(Country("Israel", "IL", 972, R.drawable.flag_376))
        arrayList.add(Country("Italy", "IT", 39, R.drawable.flag_380))
        arrayList.add(Country("Jamaica", "JM", 1876, R.drawable.flag_388))
        arrayList.add(Country("Japan", "JP", 81, R.drawable.flag_392))
        arrayList.add(Country("Jersey", "JE", 44, R.drawable.flag_832))
        arrayList.add(Country("Jordan", "JO", 962, R.drawable.flag_400))
        arrayList.add(Country("Kazakhstan", "KZ", 76, R.drawable.flag_398))
        arrayList.add(Country("Kenya", "KE", 254, R.drawable.flag_404))
        arrayList.add(Country("Kiribati", "KI", 686, R.drawable.flag_296))
        arrayList.add(Country("Kuwait", "KW", 965, R.drawable.flag_414))
        arrayList.add(Country("Kyrgyzstan", "KG", 996, R.drawable.flag_417))
        arrayList.add(Country("Lao People's Democratic Republic", "LA", 856, R.drawable.flag_418))
        arrayList.add(Country("Latvia", "LV", 371, R.drawable.flag_428))
        arrayList.add(Country("Lebanon", "LB", 961, R.drawable.flag_422))
        arrayList.add(Country("Lesotho", "LS", 266, R.drawable.flag_426))
        arrayList.add(Country("Liberia", "LR", 231, R.drawable.flag_430))
        arrayList.add(Country("Libya", "LY", 218, R.drawable.flag_434))
        arrayList.add(Country("Liechtenstein", "LI", 423, R.drawable.flag_438))
        arrayList.add(Country("Lithuania", "LT", 370, R.drawable.flag_440))
        arrayList.add(Country("Luxembourg", "LU", 352, R.drawable.flag_442))
        arrayList.add(Country("Macao", "MO", 853, R.drawable.flag_446))
        arrayList.add(
            Country(
                "Macedonia (the former Yugoslav Republic of)",
                "MK",
                389,
                R.drawable.flag_807
            )
        )
        arrayList.add(Country("Madagascar", "MG", 261, R.drawable.flag_450))
        arrayList.add(Country("Malawi", "MW", 265, R.drawable.flag_454))
        arrayList.add(Country("Malaysia", "MY", 60, R.drawable.flag_458))
        arrayList.add(Country("Maldives", "MV", 960, R.drawable.flag_462))
        arrayList.add(Country("Mali", "ML", 223, R.drawable.flag_466))
        arrayList.add(Country("Malta", "MT", 356, R.drawable.flag_470))
        arrayList.add(Country("Marshall Islands", "MH", 692, R.drawable.flag_584))
        arrayList.add(Country("Martinique", "MQ", 596, R.drawable.flag_474))
        arrayList.add(Country("Mauritania", "MR", 222, R.drawable.flag_478))
        arrayList.add(Country("Mauritius", "MU", 230, R.drawable.flag_480))
        arrayList.add(Country("Mayotte", "YT", 262, R.drawable.flag_175))
        arrayList.add(Country("Mexico", "MX", 52, R.drawable.flag_484))
        arrayList.add(Country("Micronesia (Federated States of)", "FM", 691, R.drawable.flag_583))
        arrayList.add(Country("Moldova (Republic of)", "MD", 373, R.drawable.flag_498))
        arrayList.add(Country("Monaco", "MC", 377, R.drawable.flag_492))
        arrayList.add(Country("Mongolia", "MN", 976, R.drawable.flag_496))
        arrayList.add(Country("Montenegro", "ME", 382, R.drawable.flag_499))
        arrayList.add(Country("Montserrat", "MS", 1664, R.drawable.flag_500))
        arrayList.add(Country("Morocco", "MA", 212, R.drawable.flag_504))
        arrayList.add(Country("Mozambique", "MZ", 258, R.drawable.flag_508))
        arrayList.add(Country("Myanmar", "MM", 95, R.drawable.flag_104))
        arrayList.add(Country("Namibia", "NA", 264, R.drawable.flag_516))
        arrayList.add(Country("Nauru", "NR", 674, R.drawable.flag_520))
        arrayList.add(Country("Nepal", "NP", 977, R.drawable.flag_524))
        arrayList.add(Country("Netherlands", "NL", 31, R.drawable.flag_528))
        arrayList.add(Country("New Caledonia", "NC", 687, R.drawable.flag_540))
        arrayList.add(Country("New Zealand", "NZ", 64, R.drawable.flag_554))
        arrayList.add(Country("Nicaragua", "NI", 505, R.drawable.flag_558))
        arrayList.add(Country("Niger", "NE", 227, R.drawable.flag_562))
        arrayList.add(Country("Nigeria", "NG", 234, R.drawable.flag_566))
        arrayList.add(Country("Niue", "NU", 683, R.drawable.flag_570))
        arrayList.add(
            Country(
                "Korea (Democratic People's Republic of)",
                "KP",
                850,
                R.drawable.flag_408
            )
        )
        arrayList.add(Country("Northern Mariana Islands", "MP", 1670, R.drawable.flag_580))
        arrayList.add(Country("Norway", "NO", 47, R.drawable.flag_578))
        arrayList.add(Country("Oman", "OM", 968, R.drawable.flag_512))
        arrayList.add(Country("Pakistan", "PK", 92, R.drawable.flag_586))
        arrayList.add(Country("Palau", "PW", 680, R.drawable.flag_585))
        arrayList.add(Country("Palestine, State of", "PS", 970, R.drawable.flag_275))
        arrayList.add(Country("Panama", "PA", 507, R.drawable.flag_591))
        arrayList.add(Country("Papua New Guinea", "PG", 675, R.drawable.flag_598))
        arrayList.add(Country("Paraguay", "PY", 595, R.drawable.flag_600))
        arrayList.add(Country("Peru", "PE", 51, R.drawable.flag_604))
        arrayList.add(Country("Philippines", "PH", 63, R.drawable.flag_608))
        arrayList.add(Country("Pitcairn", "PN", 64, R.drawable.flag_612))
        arrayList.add(Country("Poland", "PL", 48, R.drawable.flag_616))
        arrayList.add(Country("Portugal", "PT", 351, R.drawable.flag_620))
        arrayList.add(Country("Puerto Rico", "PR", 1787, R.drawable.flag_630))
        arrayList.add(Country("Qatar", "QA", 974, R.drawable.flag_634))
        arrayList.add(Country("Réunion", "RE", 262, R.drawable.flag_638))
        arrayList.add(Country("Romania", "RO", 40, R.drawable.flag_642))
        arrayList.add(Country("Russian Federation", "RU", 7, R.drawable.flag_643))
        arrayList.add(Country("Rwanda", "RW", 250, R.drawable.flag_646))
        arrayList.add(Country("Saint Barthélemy", "BL", 590, R.drawable.flag_652))
        arrayList.add(
            Country(
                "Saint Helena, Ascension and Tristan da Cunha",
                "SH",
                290,
                R.drawable.flag_654
            )
        )
        arrayList.add(Country("Saint Kitts and Nevis", "KN", 1869, R.drawable.flag_659))
        arrayList.add(Country("Saint Lucia", "LC", 1758, R.drawable.flag_662))
        arrayList.add(Country("Saint Martin (French part)", "MF", 590, R.drawable.flag_663))
        arrayList.add(
            Country(
                "Saint Vincent and the Grenadines",
                "VC",
                1784,
                R.drawable.flag_670
            )
        )
        arrayList.add(Country("Samoa", "WS", 685, R.drawable.flag_882))
        arrayList.add(Country("San Marino", "SM", 378, R.drawable.flag_674))
        arrayList.add(Country("Sao Tome and Principe", "ST", 239, R.drawable.flag_678))
        arrayList.add(Country("Saudi Arabia", "SA", 966, R.drawable.flag_682))
        arrayList.add(Country("Senegal", "SN", 221, R.drawable.flag_686))
        arrayList.add(Country("Serbia", "RS", 381, R.drawable.flag_688))
        arrayList.add(Country("Seychelles", "SC", 248, R.drawable.flag_690))
        arrayList.add(Country("Sierra Leone", "SL", 232, R.drawable.flag_694))
        arrayList.add(Country("Singapore", "SG", 65, R.drawable.flag_702))
        arrayList.add(Country("Sint Maarten (Dutch part)", "SX", 1721, R.drawable.flag_534))
        arrayList.add(Country("Slovakia", "SK", 421, R.drawable.flag_703))
        arrayList.add(Country("Slovenia", "SI", 386, R.drawable.flag_705))
        arrayList.add(Country("Solomon Islands", "SB", 677, R.drawable.flag_090))
        arrayList.add(Country("Somalia", "SO", 252, R.drawable.flag_706))
        arrayList.add(Country("South Africa", "ZA", 27, R.drawable.flag_710))
        arrayList.add(
            Country(
                "South Georgia and the South Sandwich Islands",
                "GS",
                500,
                R.drawable.flag_239
            )
        )
        arrayList.add(Country("Korea (Republic of)", "KR", 82, R.drawable.flag_410))
        arrayList.add(Country("South Sudan", "SS", 211, R.drawable.flag_728))
        arrayList.add(Country("Spain", "ES", 34, R.drawable.flag_724))
        arrayList.add(Country("Sri Lanka", "LK", 94, R.drawable.flag_144))
        arrayList.add(Country("Sudan", "SD", 249, R.drawable.flag_729))
        arrayList.add(Country("Suriname", "SR", 597, R.drawable.flag_740))
        arrayList.add(Country("Svalbard and Jan Mayen", "SJ", 4779, R.drawable.flag_744))
        arrayList.add(Country("Swaziland", "SZ", 268, R.drawable.flag_748))
        arrayList.add(Country("Sweden", "SE", 46, R.drawable.flag_752))
        arrayList.add(Country("Switzerland", "CH", 41, R.drawable.flag_756))
        arrayList.add(Country("Syrian Arab Republic", "SY", 963, R.drawable.flag_760))
        arrayList.add(Country("Taiwan", "TW", 886, R.drawable.flag_158))
        arrayList.add(Country("Tajikistan", "TJ", 992, R.drawable.flag_762))
        arrayList.add(Country("Tanzania, United Republic of", "TZ", 255, R.drawable.flag_834))
        arrayList.add(Country("Thailand", "TH", 66, R.drawable.flag_764))
        arrayList.add(Country("Timor-Leste", "TL", 670, R.drawable.flag_626))
        arrayList.add(Country("Togo", "TG", 228, R.drawable.flag_768))
        arrayList.add(Country("Tokelau", "TK", 690, R.drawable.flag_772))
        arrayList.add(Country("Tonga", "TO", 676, R.drawable.flag_776))
        arrayList.add(Country("Trinidad and Tobago", "TT", 1868, R.drawable.flag_780))
        arrayList.add(Country("Tunisia", "TN", 216, R.drawable.flag_788))
        arrayList.add(Country("Turkey", "TR", 90, R.drawable.flag_792))
        arrayList.add(Country("Turkmenistan", "TM", 993, R.drawable.flag_795))
        arrayList.add(Country("Turks and Caicos Islands", "TC", 1649, R.drawable.flag_796))
        arrayList.add(Country("Tuvalu", "TV", 688, R.drawable.flag_798))
        arrayList.add(Country("Uganda", "UG", 256, R.drawable.flag_800))
        arrayList.add(Country("Ukraine", "UA", 380, R.drawable.flag_804))
        arrayList.add(Country("United Arab Emirates", "AE", 971, R.drawable.flag_784))
        arrayList.add(
            Country(
                "United Kingdom of Great Britain and Northern Ireland",
                "GB",
                44,
                R.drawable.flag_826
            )
        )
        arrayList.add(Country("United States of America", "US", 1, R.drawable.flag_840))
        arrayList.add(Country("Uruguay", "UY", 598, R.drawable.flag_858))
        arrayList.add(Country("Uzbekistan", "UZ", 998, R.drawable.flag_860))
        arrayList.add(Country("Vanuatu", "VU", 678, R.drawable.flag_548))
        arrayList.add(
            Country(
                "Venezuela (Bolivarian Republic of)",
                "VE",
                58,
                R.drawable.flag_862
            )
        )
        arrayList.add(Country("Viet Nam", "VN", 84, R.drawable.flag_704))
        arrayList.add(Country("Wallis and Futuna", "WF", 681, R.drawable.flag_876))
        arrayList.add(Country("Western Sahara", "EH", 212, R.drawable.flag_732))
        arrayList.add(Country("Yemen", "YE", 967, R.drawable.flag_887))
        arrayList.add(Country("Zambia", "ZM", 260, R.drawable.flag_894))
        arrayList.add(Country("Zimbabwe", "ZW", 263, R.drawable.flag_716))
    }

}