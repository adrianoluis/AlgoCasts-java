package net.adrianoluis.study.binarysearch;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() {
		solution = new Solution();
	}

	@Test
	public void test1() throws Throwable {
		int[] a = new int[]{513, 390, 708, 900, 455, 297, 894, 426, 714,
				866, 360, 148, 199, 633, 264, 28, 303, 294, 647, 674, 969, 223, 236, 513, 421, 996, 75, 964, 104, 74,
				316, 584, 402, 398, 404, 854, 731, 7, 180, 381, 860, 895, 227, 777, 353, 83, 881, 978, 451, 578, 57,
				613, 331, 819, 697, 540, 842, 873, 557, 127, 267, 824, 762, 220, 364, 595, 52, 961, 50, 626, 274, 946,
				8, 44, 214, 181, 46, 355, 373, 733, 154, 569, 278, 897, 546, 920, 998, 482, 62, 962, 955, 972, 830,
				60, 902, 855, 449, 471, 369, 780, 515, 310, 794, 241, 726, 938, 677, 473, 649, 300, 747, 793, 219,
				637, 128, 575, 436, 790, 721, 177, 676, 386, 380, 444, 376, 18, 187, 306, 488, 307, 939, 605, 813,
				594, 286, 541, 47, 745, 161, 672, 725, 3, 601, 450, 72, 744, 479, 126, 835, 789, 370, 838, 678, 342,
				871, 770, 173, 10, 155, 607, 909, 642, 788, 119, 805, 544, 652, 743, 420, 977, 519, 883, 103, 69, 599,
				666, 717, 27, 481, 259, 377, 317, 653, 791, 383, 211, 954, 706, 501, 247, 222, 651, 463, 82, 904, 137,
				624, 539, 849, 80, 191, 784, 309, 913, 737, 335, 39, 242, 797, 81, 709, 983, 549, 497, 551, 937, 903,
				506, 760, 167, 928, 494, 399, 339, 224, 229, 384, 308, 735, 374, 319, 823, 950, 530, 958, 201, 100,
				665, 462, 123, 273, 654, 159, 251, 618, 321, 130, 114, 543, 692, 727, 598, 269, 832, 378, 876, 31,
				153, 422, 396, 243, 723, 994, 809, 796, 253, 963, 170, 429, 992, 101, 531, 141, 566, 865, 423, 947,
				942, 739, 147, 868, 645, 93, 299, 244, 499, 257, 850, 875, 749, 129, 16, 265, 892, 217, 518, 517, 694,
				472, 30, 509, 635, 696, 684, 916, 492, 888, 901, 279, 880, 454, 98, 6, 503, 121, 511, 581, 118, 385,
				435, 667, 833, 135, 700, 668, 314, 592, 327, 953, 548, 403, 690, 859, 629, 252, 722, 189, 512, 322,
				527, 225, 763, 132, 158, 249, 246, 644, 238, 332, 112, 755, 276, 207, 934, 588, 884, 896, 320, 489,
				648, 469, 291, 533, 602, 611, 408, 783, 638, 213, 1, 323, 593, 379, 311, 986, 345, 608, 769, 603, 845,
				908, 392, 293, 728, 889, 21, 583, 111, 226, 671, 260, 358, 329, 97, 388, 196, 412, 149, 442, 89, 70,
				361, 447, 600, 630, 872, 713, 305, 438, 389, 36, 534, 14, 680, 821, 799, 33, 357, 911, 691, 427, 443,
				730, 572, 781, 405, 483, 4, 891, 84, 858, 230, 382, 609, 124, 235, 234, 538, 446, 500, 529, 878, 929,
				391, 757, 655, 395, 94, 157, 936, 208, 210, 29, 982, 172, 811, 573, 736, 712, 882, 20, 532, 76, 798,
				233, 350, 615, 853, 73, 95, 536, 688, 171, 610, 288, 58, 504, 105, 133, 768, 77, 480, 347, 960, 258,
				995, 237, 792, 985, 776, 248, 987, 981, 669, 720, 326, 590, 445, 682, 663, 204, 202, 432, 197, 980,
				168, 926, 424, 917, 1000, 65, 906, 468, 661, 707, 460, 282, 570, 250, 552, 160, 456, 464, 898, 439,
				587, 520, 857, 537, 45, 656, 814, 861, 232, 772, 64, 806, 337, 56, 623, 152, 952, 295, 42, 19, 701,
				606, 752, 545, 176, 54, 565, 415, 910, 941, 973, 742, 334, 410, 887, 535, 66, 753, 63, 640, 925, 354,
				476, 968, 175, 634, 949, 216, 984, 387, 349, 465, 266, 945, 38, 312, 71, 933, 751, 458, 826, 138, 571,
				764, 333, 870, 746, 441, 837, 166, 650, 359, 139, 542, 292, 271, 487, 970, 240, 831, 40, 367, 767,
				641, 87, 215, 254, 419, 522, 643, 61, 394, 759, 11, 771, 621, 561, 804, 664, 502, 912, 340, 474, 508,
				686, 670, 863, 579, 662, 956, 997, 143, 32, 406, 205, 867, 134, 879, 604, 685, 556, 591, 921, 886,
				417, 302, 425, 270, 136, 285, 716, 96, 885, 25, 841, 993, 567, 485, 179, 68, 478, 263, 704, 915, 268,
				145, 262, 9, 564, 255, 711, 41, 185, 2, 298, 562, 318, 338, 614, 807, 773, 931, 516, 812, 585, 774,
				836, 99, 414, 971, 486, 778, 283, 597, 49, 526, 754, 368, 738, 304, 918, 750, 775, 198, 498, 927, 169,
				289, 856, 659, 979, 787, 514, 67, 131, 53, 174, 107, 907, 475, 632, 272, 576, 457, 146, 15, 703, 818,
				109, 765, 914, 740, 848, 346, 890, 718, 732, 144, 212, 507, 17, 416, 452, 899, 815, 428, 86, 810, 344,
				675, 957, 715, 375, 782, 434, 636, 839, 113, 785, 116, 453, 79, 586, 559, 834, 761, 178, 563, 261,
				324, 874, 631, 352, 150, 35, 505, 22, 330, 397, 190, 844, 574, 461, 467, 852, 699, 343, 218, 620, 239,
				816, 817, 91, 228, 596, 418, 433, 617, 840, 658, 188, 287, 13, 193, 371, 341, 695, 162, 284, 120, 437,
				990, 568, 493, 547, 275, 976, 622, 989, 521, 905, 194, 869, 639, 628, 657, 90, 221, 919, 965, 413,
				491, 85, 991, 827, 786, 820, 23, 822, 555, 803, 365, 681, 431, 495, 125, 710, 808, 554, 948, 348, 301,
				356, 705, 851, 115, 748, 351, 560, 800, 51, 702, 372, 5, 589, 195, 142, 477, 923, 336, 245, 558, 689,
				313, 930, 256, 363, 922, 496, 24, 448, 315, 999, 163, 616, 156, 864, 951, 524, 466, 741, 328, 625,
				183, 893, 679, 550, 490, 553, 646, 280, 687, 724, 43, 627, 525, 734, 846, 140, 943, 932, 37, 683, 407,
				411, 523, 729, 698, 366, 693, 801, 758, 296, 400, 102, 660, 59, 151, 673, 186, 362, 974, 106, 203,
				802, 110, 164, 847, 944, 877, 470, 459, 766, 206, 719, 959, 231, 88, 108, 577, 290, 580, 281, 988,
				200, 582, 117, 184, 779, 277, 440, 828, 393, 182, 975, 26, 165, 484, 966, 843, 192, 940, 510, 862,
				430, 209, 401, 48, 612, 55, 325, 924, 34, 92, 756, 122, 78, 12, 409, 935, 619, 967, 829, 795, 825,
				528};
		Arrays.sort(a);
		assertEquals("found '5' at index 4", 5, solution.binarySearch(a, 1000));
	}
}
