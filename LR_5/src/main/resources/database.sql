USE [JAVA_lab5]
GO
/****** Object:  Table [dbo].[Students]    Script Date: 03.06.2023 15:03:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Students](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[firstName] [nchar](20) NOT NULL,
	[middleName] [nchar](20) NOT NULL,
	[lastName] [nchar](20) NOT NULL,
	[birthday] [date] NOT NULL,
	[recordBookNumber] [int] NOT NULL,
 CONSTRAINT [PK_Students] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
